package rf.hir.controller;

import org.springframework.stereotype.Repository;
import rf.hir.dao.NewsDAO;
//import rf.hir.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfilController {


    @GetMapping("/profil")
    public String cikk(){

        SecurityContext ctx = SecurityContextHolder.getContext();

        System.out.println("Auth:");
        System.out.println(ctx.getAuthentication());
        return "profil";
    }
}