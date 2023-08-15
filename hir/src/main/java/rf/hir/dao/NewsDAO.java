package rf.hir.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import rf.hir.model.News;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@Repository
public class NewsDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public void addNews(News news, int kategoria_id){
        String sql = "INSERT INTO hir(cim, tartalom, kep_utvonal, szerzo_id, kategoria_id) VALUES (?,?,?,?,?)";
        getJdbcTemplate().update(sql, new Object[]{
                news.getCim(), news.getTartalom(), news.getKep_utvonal(), news.getSzerzo_id(), kategoria_id
        });
    }

    public News getNewsByTitle(String title) throws SQLException {
        String sql = "SELECT * FROM hir WHERE cim=?";
        List<News> result = getJdbcTemplate().query(sql, new NewsRowMapper(), title);
        return result.get(0);
    }
    public News getNewsById(int id) throws SQLException {
//        String sql = "SELECT * FROM hir WHERE id=?";
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and hir.id = ?\n" +
                "ORDER by hir.id DESC;";
        List<News> result = getJdbcTemplate().query(sql, new NewsRowMapper(), id);
        return result.get(0);
    }

    public void updateNews(News news){
        String sql = "UPDATE hir SET cim='" + news.getCim() + "', tartalom='"+ news.getTartalom() +"',  kep_utvonal='"+ news.getKep_utvonal() +"', kategoria_id="+ news.getKategoria_id() +" WHERE id="+ news.getNews_id() + ";";
//        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql);

    }

    //under construction de elmeletileg ez listazza ki az osszes hirt hogy utana meg tudjam jeleniteni
    public List < News > listNews(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria FROM hir, kategoria WHERE hir.kategoria_id = kategoria.id ORDER by hir.id DESC";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum(row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));
            result.add(news);
        }
        return result;
    }

    public List < News > listTech(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and kategoria.nev LIKE 'Tech'" +
                "ORDER by hir.id DESC;";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum((String) row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));

            result.add(news);
        }

        return result;
    }

    public List < News > listSport(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and kategoria.nev LIKE 'Sport'" +
                "ORDER by hir.id DESC;";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum((String) row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));

            result.add(news);
        }

        return result;
    }

    public List < News > listBelfold(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and kategoria.nev LIKE 'Belföld'" +
                "ORDER by hir.id DESC;";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum((String) row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));

            result.add(news);
        }

        return result;
    }

    public List < News > listKulfold(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and kategoria.nev LIKE 'Külföld'" +
                "ORDER by hir.id DESC;";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum((String) row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));

            result.add(news);
        }

        return result;
    }

    public List < News > listKultura(){
        String sql = "SELECT hir.id, hir.cim, hir.datum, hir.tartalom, hir.kep_utvonal, hir.szerzo_id, kategoria.nev as kategoria\n" +
                "FROM hir, kategoria\n" +
                "WHERE (hir.kategoria_id = kategoria.id) and kategoria.nev LIKE 'Kultúra'" +
                "ORDER by hir.id DESC;";
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < News > result = new ArrayList < News > ();
        for (Map < String, Object > row: rows) {
            News news = new News();
            news.setNews_id((Integer) row.get("id"));
            news.setCim((String) row.get("cim"));
            news.setDatum((String) row.get("datum").toString());
            news.setTartalom((String) row.get("tartalom"));
            news.setKep_utvonal((String) row.get("kep_utvonal"));
            news.setSzerzo_id((Integer) row.get("szerzo_id"));
            news.setKategoria_id((String) row.get("kategoria"));

            result.add(news);
        }

        return result;
    }

}
