package rf.hir.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import rf.hir.model.User;


public class UserRowMapper implements RowMapper<User>{
    @Override
    @Nullable
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("jelszo"));
        user.setRole(rs.getString("admin"));
        user.setName(rs.getString("nev"));
        return user;
    }
}
