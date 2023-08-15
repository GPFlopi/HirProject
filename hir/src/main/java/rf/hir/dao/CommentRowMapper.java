package rf.hir.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import rf.hir.model.Comment;
import rf.hir.model.News;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentRowMapper implements RowMapper<Comment> {

    @Override
    @Nullable
    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();
        comment.setCommentID(rs.getInt("id"));
        comment.setComment(rs.getString("tartalom"));
        comment.setHirID(rs.getInt("hir_id"));
        comment.setCommenterID(rs.getInt("felhasznalo_id"));
        return comment;
    }
}
