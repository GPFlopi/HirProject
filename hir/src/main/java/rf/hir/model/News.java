package rf.hir.model;

public class News {
    int news_id;
    String cim;
    String datum;
    String tartalom;
    String kep_utvonal;
    int szerzo_id;
    String kategoria_id;

    public News(int id, String cim, String datum, String tartalom, String kep_utvonal, int szerzo_id, String kategoria_id) {
        this.news_id = id;
        this.cim = cim;
        this.datum = datum;
        this.tartalom = tartalom;
        this.kep_utvonal = kep_utvonal;
        this.szerzo_id = szerzo_id;
        this.kategoria_id = kategoria_id;
    }
    public News(String cim, String tartalom, String kep_utvonal, int szerzo_id, String kategoria_id) {
        this.news_id = -1;
        this.cim = cim;
        this.datum = "datum";
        this.tartalom = tartalom;
        this.kep_utvonal = kep_utvonal;
        this.szerzo_id = szerzo_id;
        this.kategoria_id = kategoria_id;
    }

    public News() {
        this.news_id=0;
        this.cim = "";
        this.datum = "";
        this.tartalom = "";
        this.kep_utvonal = "";
        this.szerzo_id = 0;
        this.kategoria_id = "none";
    }
    public News(News news) {
        this.news_id=news.getNews_id();
        this.cim=news.getCim();
        this.datum=news.getDatum();
        this.tartalom=news.getTartalom();
        this.kep_utvonal=news.getKep_utvonal();
        this.szerzo_id=news.getSzerzo_id();
        this.kategoria_id=news.getKategoria_id();
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int id) {
        this.news_id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public String getKep_utvonal() {
        return kep_utvonal;
    }

    public void setKep_utvonal(String kep_utvonal) {
        this.kep_utvonal = kep_utvonal;
    }

    public int getSzerzo_id() {
        return szerzo_id;
    }

    public void setSzerzo_id(int szerzo_id) {
        this.szerzo_id = szerzo_id;
    }

    public String getKategoria_id() {
        return kategoria_id;
    }

    public void setKategoria_id(String kategoria_id) {
        this.kategoria_id = kategoria_id;
    }

    @Override
    public String toString() {
        return "News{" +
                "news_id=" + news_id +
                ", cim='" + cim + '\'' +
                ", datum=" + datum +
                ", tartalom='" + tartalom + '\'' +
                ", kep_utvonal='" + kep_utvonal + '\'' +
                ", szerzo_id=" + szerzo_id +
                ", kategoria_id=" + kategoria_id +
                '}';
    }
}
