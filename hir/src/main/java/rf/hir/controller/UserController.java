package rf.hir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import rf.hir.dao.NewsDAO;
import rf.hir.dao.UserDAO;
import rf.hir.model.News;
import rf.hir.model.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
//@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private NewsDAO newsDAO;


    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/admin")
    public String admin(Model model) throws SQLException {

        //csak akkor tölti ki automatikusan a szerkesztés mezőket, ha a /cikk oldalról navigált ide
        if(model.getAttribute("news_id") != null){
            News news = new News(newsDAO.getNewsById((int) model.getAttribute("news_id")));
            model.addAttribute("news_id", news.getNews_id());
            model.addAttribute("news_cim", news.getCim());
            model.addAttribute("news_tartalom", news.getTartalom());
            model.addAttribute("news_keputvonal", news.getKep_utvonal());
            model.addAttribute("news_kategoriaid", news.getKategoria_id());
        }

        return "admin";
    }

    @GetMapping("/delete")
    public String listUser(Model model) throws SQLException {
        List< User > userList = userDAO.getAllUser();
        model.addAttribute("users", userList);

        return "admin";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userDAO.deleteUser(id);

        return "redirect:/delete";
    }




        //Az elso parameter az a jelenlegi neve a felhasznlónka, amik utána vanna azok az új értékek!
    // Ha ez a forma nem jó csak szólj és átírjúj úgy hogy jó legyen(B.Patrik)
    @PostMapping(value = "/updateUser")
    public String updateUser(@RequestParam("user")String username,
                             @RequestParam("intdEmail")String intdEmail,
                             @RequestParam("intdname")String intdname,
                             @RequestParam("intdpassword")String intdpassword) throws SQLException {
        if(userDAO.isUserReal(username)){
            User user = userDAO.getUserByUsername(username);
            if(!user.getName().equals(intdname)) user.setName(intdname);
            if(!user.getEmail().equals(intdEmail)) user.setEmail(intdEmail);
            if(!user.getPassword().equals(intdpassword)) user.setPassword(intdpassword);
            userDAO.updateUser(user);
        }
        return "/";
    }

    @PostMapping(value="/roleChange")
    public String roleChange(@RequestParam("admin")int adminID,@RequestParam("user") String username,@RequestParam("intendedRole")String intdRole) throws SQLException {
        User admin = userDAO.getUserById(adminID);
        if(!admin.getRole().equals("2")) return "/error";
        User user = userDAO.getUserByUsername(username);
        if(!user.getRole().equals(intdRole)){
            System.out.println(userDAO.changeRole(user,intdRole));
            return "/";
        }else return "/error";
    }

    @PostMapping(value = "/registeruser")
    public String registerUser(RedirectAttributes redirAttrs, @RequestParam("email") String email, @RequestParam("password") String password,
                               @RequestParam("password2") String password2, @RequestParam("username") String name) throws SQLException {
        if(password.equals(password2) && email.contains("@")){
            if(userDAO.isUserReal(name)) {
                redirAttrs.addFlashAttribute("error", "A felhasználó már létezik");
                return "redirect:/";
            }
            User user = new User(email, password, name, "0");
            userDAO.insertUser(user);
            redirAttrs.addFlashAttribute("success", "Sikeres regisztráció");
        }
        return "redirect:/";
    }
}