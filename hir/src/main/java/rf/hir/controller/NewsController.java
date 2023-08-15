package rf.hir.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rf.hir.model.News;
import rf.hir.model.User;
import rf.hir.dao.NewsDAO;
//import rf.hir.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rf.hir.dao.UserDAO;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private NewsDAO newsDAO;


    SecurityContext ctx ;
    @GetMapping("/news/{id}")
    public String cikk(@PathVariable("id") int id, Model model, RedirectAttributes redirectAttributes, HttpServletRequest request) throws SQLException {

        ctx = SecurityContextHolder.getContext();

        //szerkesztéskor mindig a 21-es id-vel rendelkező cikket niytja meg egyelőre,
        // mert a /cikk oldalon még nem adatbázisból tölti be a cikket
        News news = new News(newsDAO.getNewsById(id));
        model.addAttribute("news_cim", news.getCim());
        model.addAttribute("news_id", news.getNews_id());
        model.addAttribute("news_tartalom", news.getTartalom());
        model.addAttribute("news_kategoriaid", news.getKategoria_id());
        model.addAttribute("news_keputvonal", news.getKep_utvonal());
//        System.out.println(model.getAttribute("news_cim"));

//        redirectAttributes.addFlashAttribute("news", news);
//        System.out.println(redirectAttributes.getFlashAttributes());
        return "news";

    }

    @PostMapping("/editNews/{id}")
    public String editNews(@PathVariable("id") int id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("news_id", id);
        return "redirect:/admin";
    }

    @PostMapping("/addNews")
    public String addNews(@RequestParam("cim")String cim,
                          @RequestParam("tartalom")String tartalom,
                          @RequestParam("kep_utvonal")String kep_utvonal,
                          @RequestParam("kategoria")String kategoria
                          ) throws SQLException {
        ctx = SecurityContextHolder.getContext();
        User user = userDAO.getUserByEmail(ctx.getAuthentication().getName());

        News news = new News(cim,tartalom,kep_utvonal,user.getId(),kategoria);

        int kategoria_id = 1;
        switch (kategoria){
            case "Belföld":
                kategoria_id = 2;
                break;
            case "Külföld":
                kategoria_id = 3;
                break;
            case "Kultúra":
                kategoria_id = 4;
                break;
            case "Tech":
                kategoria_id = 5;
        }
        newsDAO.addNews(news, kategoria_id);
        return "redirect:/admin";
    }

    @PostMapping("/getNewsbytitle")
    public String getNewsByTitle(@RequestParam("cim")String cim, Model model) throws SQLException {
        News news = new News(newsDAO.getNewsByTitle(cim));
        model.addAttribute("news_cim", news.getCim());
        model.addAttribute("news_id", news.getNews_id());
        model.addAttribute("news_tartalom", news.getTartalom());
        model.addAttribute("news_kategoriaid", news.getKategoria_id());
        model.addAttribute("news_keputvonal", news.getKep_utvonal());
        return"redirect:/admin";
    }



    @PostMapping("/updateNews/{id}")
    public String updateNews(@RequestParam("cim")String cim,
                             @RequestParam("tartalom")String tartalom,
                             @RequestParam("kep_utvonal")String kep_utvonal,
                             @PathVariable("id") int id,
                             Model model) throws SQLException {
        ctx = SecurityContextHolder.getContext();
        User user = userDAO.getUserByEmail(ctx.getAuthentication().getName());

        News news = new News(id, cim, "datum", tartalom, kep_utvonal, user.getId(),newsDAO.getNewsById(id).getKategoria_id());
        newsDAO.updateNews(news);

        return"redirect:/admin";
    }

    @GetMapping("/")
    public String listNews(Model model) {
        List < News > newsList = newsDAO.listNews();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "index";
    }

    @GetMapping("/Tech")
    public String listTech(Model model) {
        List < News > newsList = newsDAO.listTech();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "Tech";
    }

    @GetMapping("/Sport")
    public String listSport(Model model) {
        List < News > newsList = newsDAO.listSport();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "Sport";
    }

    @GetMapping("/Belföld")
    public String listBelfold(Model model) {
        List < News > newsList = newsDAO.listBelfold();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "Belföld";
    }

    @GetMapping("/Külföld")
    public String listKulfold(Model model) {
        List < News > newsList = newsDAO.listKulfold();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "Külföld";
    }

    @GetMapping("/Kultúra")
    public String listKultura(Model model) {
        List < News > newsList = newsDAO.listKultura();
        model.addAttribute("highlight", newsList.get(0));
        newsList.remove(0);
        model.addAttribute("news", newsList);

        return "Kultúra";
    }


}
