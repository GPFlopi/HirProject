package rf.hir.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import rf.hir.model.User;
@Repository
public class UserDAO extends JdbcDaoSupport {
    @Lazy
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public void insertUser(User user) {
        String sql = "INSERT INTO felhasznalo(email, nev, jelszo, admin ) VALUES (?, ?, ?, ?)";
        getJdbcTemplate().update(sql, new Object[] {
                user.getEmail(), user.getName(), passwordEncoder.encode(user.getPassword()) ,user.getRole()
        });
        //user.getEmail(), user.getName(), passwordEncoder.encode(user.getPassword())
    }

    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE felhasznalo SET email='?' , nev='?' , jelszo='?' WHERE id=?;";
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql, user.getEmail(),
                user.getName(),
                passwordEncoder.encode(user.getPassword()),
                user.getId());
        System.out.println(user.getUsername()+" has been updated!");
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM felhasznalo WHERE id=?";
        List<User> result = getJdbcTemplate().query(sql, new UserRowMapper(), id);
        return result.get(0);

    }

    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM felhasznalo WHERE email=?";
        List<User> result = getJdbcTemplate().query(sql, new UserRowMapper(), email);
        return result.get(0);
    }

    public User getUserByUsername(String uname) {
        String sql = "SELECT * FROM felhasznalo WHERE nev = ?";
        List<User> result = getJdbcTemplate().query(sql, new UserRowMapper(), uname);

        return result.get(0);

    }

    public List<User> getAllUser() throws SQLException {
        String sql = "SELECT * FROM felhasznalo;";

        List<User> ret = getJdbcTemplate().query(sql,new UserRowMapper());

        return ret;
    }

    public String changeRole(User user, String role) throws SQLException {
        user.setRole(role);
        String sql = "UPDATE felhasznalo SET admin=? Where id=?;";
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql, Integer.valueOf(user.getRole()),
                user.getId());
        return "Role Changed";
    }

    public boolean isUserReal(String name) throws SQLException {
        List<User> list = getAllUser();

        for(User i: list){
            if(i.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean isUserReal(int id) throws SQLException {
        List<User> list = getAllUser();

        for(User i: list){
            if(i.getId() == id){
                return true;
            }
        }
        return false;
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM felhasznalo WHERE id=" + id;
        getJdbcTemplate().update(sql);
    }

}
