package application.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import application.model.User;

@Repository
public class UserDAO extends JdbcDaoSupport {

  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  DataSource dataSource;

  @PostConstruct
  private void initialize() {
    setDataSource(dataSource);
  }

  public void insertUser(User user) {
    String sql = "INSERT INTO users(email, password, role) VALUES (?, ?, ?)";
    getJdbcTemplate().update(sql, new Object[] {
      user.getEmail(), passwordEncoder.encode(user.getPassword()), user.getRole()
    });
  }

  public User getUserById(int id) {
    String sql = "SELECT * FROM users WHERE id=?";
    List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql, id);

    List < User > result = new ArrayList < User > ();
    for (Map < String, Object > row: rows) {
      User user = new User();
      user.setId((Integer) row.get("id"));
      user.setEmail((String) row.get("email"));
      user.setPassword((String) row.get("password"));
      user.setRole((String) row.get("role"));
      result.add(user);
    }

    return result.get(0);
  }

  public User getUserByEmail(String email) {
    String sql = "SELECT * FROM users WHERE email=?";
    List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql, email);

    List < User > result = new ArrayList < User > ();
    for (Map < String, Object > row: rows) {
      User user = new User();
      user.setId((Integer) row.get("id"));
      user.setEmail((String) row.get("email"));
      user.setPassword((String) row.get("password"));
      user.setRole((String) row.get("role"));
      result.add(user);
    }

    return result.get(0);
  }

}