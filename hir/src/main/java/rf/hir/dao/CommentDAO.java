package rf.hir.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import rf.hir.model.Comment;
import rf.hir.model.User;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CommentDAO extends JdbcDaoSupport {
    @Lazy
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    DataSource dataSource;

    SecurityContext ctx ;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public void insertComment(Comment comment) {
        String sql = "INSERT INTO komment(tartalom, hir_id, felhasznalo_id ) VALUES ( ?, ?, ?)";
        getJdbcTemplate().update(sql, new Object[] {
                comment.getComment(),
                comment.getHirID(),
                comment.getCommenterID()
        });
    }

    public void updateComment(Comment comment) throws SQLException {
        System.out.println(comment.getComment());
        String sql = "UPDATE komment SET tartalom=? WHERE id=?;";
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql,
                comment.getComment(),
                comment.getCommentID());
    }

    public void deleteComment(int commentID) throws SQLException {
        String sql = "DELETE FROM komment WHERE id=?";
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql,commentID);
    }

    public Comment getCommentbyID(int id)throws SQLException{
        String sql = "SELECT * FROM komment WHERE id=?";
        assert getJdbcTemplate() != null;
        List<Comment> result = getJdbcTemplate().query(sql, new CommentRowMapper(), id);

        return result.get(0);
    }


}
