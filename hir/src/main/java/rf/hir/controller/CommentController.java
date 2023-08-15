package rf.hir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rf.hir.dao.CommentDAO;
import rf.hir.dao.NewsDAO;
import rf.hir.dao.UserDAO;
import rf.hir.model.Comment;
import rf.hir.model.News;
import rf.hir.model.User;

import java.sql.SQLException;

@Controller
public class CommentController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private NewsDAO newsDAO;

    @Autowired
    private CommentDAO commentDAO;


    @GetMapping(value = "/addComment")
    public String addComment(@RequestParam("userID") int userID,
                             @RequestParam("newsID") int newsID,
                             @RequestParam("commentContents")String comment) throws SQLException{
        User user = userDAO.getUserById(userID);
        News news = newsDAO.getNewsById(newsID);
        if(user.getRole().equals("0")){
            return "/error";
        }
        Comment newComment = new Comment(user.getId(),news.getNews_id(),comment);
        commentDAO.insertComment(newComment);
        return "/admin";

    }


    @GetMapping(value = "/updateComment")
    public String updateComment(@RequestParam("userID")int userID,
                                @RequestParam("commentID")int commentID,
                                @RequestParam("newComment")String comment) throws SQLException {

        User user = userDAO.getUserById(userID);
        if(user.getRole().equals("0")){
            return "/error";
        }
        Comment comm = commentDAO.getCommentbyID(commentID);
        if(user.getId()==comm.getCommenterID() || user.getRole().equals("2")) {
            comm.setComment(comment);
            commentDAO.updateComment(comm);
            return "/admin";
        }else return "/error";
    }

    @GetMapping("/deleteComment")
    public String deleteComment(@RequestParam("adminID")int adminID,@RequestParam("commentID")int commentID) throws SQLException {
        User admin = userDAO.getUserById(adminID);
        if(!admin.getRole().equals("2")) return "/error";
        commentDAO.deleteComment(commentID);
        return "/admin";
    }


}
