package rf.hir.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import rf.hir.model.News;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsRowMapper implements RowMapper<News> {

    @Override
    @Nullable
    public News mapRow(ResultSet rs, int rowNum) throws SQLException {
        News news = new News();
        news.setNews_id(rs.getInt("id"));
        news.setCim(rs.getString("cim"));
        news.setDatum(rs.getString("datum"));
        news.setTartalom(rs.getString("tartalom"));
        news.setKep_utvonal(rs.getString("kep_utvonal"));
        news.setSzerzo_id(rs.getInt("szerzo_id"));
        news.setKategoria_id(rs.getString("kategoria"));
        return news;
    }
}
