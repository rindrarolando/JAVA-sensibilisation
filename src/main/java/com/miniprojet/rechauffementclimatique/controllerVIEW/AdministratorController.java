package com.miniprojet.rechauffementclimatique.controllerVIEW;

import com.miniprojet.rechauffementclimatique.dao.AdministratorDao;
import com.miniprojet.rechauffementclimatique.dao.ContenuDao;
import com.miniprojet.rechauffementclimatique.entities.Administrator;
import com.miniprojet.rechauffementclimatique.entities.Comment;
import com.miniprojet.rechauffementclimatique.entities.Information;
import com.miniprojet.rechauffementclimatique.entities.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class AdministratorController {

    @RequestMapping("/login")
    public String loginAdmin(HttpServletRequest request , HttpSession session){
        session = request.getSession();
        if(session.getAttribute("admin")==null) {
            return "backoffice/login";
        }else {
            return "redirect:/acceuil";
        }
    }

    @RequestMapping(value = "/login-administrator",method = RequestMethod.POST)
    public String login(HttpServletRequest request) throws SQLException {
        HttpSession session = request.getSession(true);
        String id = request.getParameter("identifiant");
        String mdp = request.getParameter("mdp");
        AdministratorDao dao = new AdministratorDao();
        if(dao.checkAdmin(id,mdp)!=null){
            Administrator admin = dao.checkAdmin(id,mdp);
            session.setAttribute("admin", admin);
            return "redirect:/acceuil";
        }else{
            return "redirect:/login?error=1";
        }
    }

    @RequestMapping("/acceuil")
    public String acceuilAdmin(HttpServletRequest request, HttpSession session , ModelMap model) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            List<Information> list = new ContenuDao().getAllInformations();
            model.addAttribute("listeinfos", list);
            return "backoffice/index";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/actus")
    public String actus(HttpServletRequest request, HttpSession session , ModelMap model) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            List<News> list = new ContenuDao().getAllNews();
            model.addAttribute("listenews", list);
            return "backoffice/actus";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/comments")
    public String comments(HttpServletRequest request, HttpSession session , ModelMap model) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            List<Comment> list = new ContenuDao().getAllComments();
            model.addAttribute("listecomments", list);
            return "backoffice/comments";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/add-commentaire")
    public String addCommentaire(HttpServletRequest request,HttpSession session,@RequestParam("commentaire") String commentaire) throws SQLException {

            new ContenuDao().addCommentaire(commentaire);
            return "frontoffice/comments";

    }

    @RequestMapping("/delete-commentaire")
    public String deletecom(HttpServletRequest request,HttpSession session,@RequestParam("id") String idd) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            int id = Integer.valueOf(idd);
            new ContenuDao().supprimerCommentaire(id);
            return "backoffice/comments";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/add-information")
    public String ajoutInformation(HttpServletRequest request,HttpSession session){
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            return "backoffice/ajout-information";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/delete-information")
    public String deleteinfo(HttpServletRequest request,HttpSession session,@RequestParam("id") String idd) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            int id = Integer.valueOf(idd);
            new ContenuDao().deleteInformation(id);
            return "redirect:/acceuil";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/add-new")
    public String ajoutNew(HttpServletRequest request,HttpSession session){
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            return "backoffice/ajout-new";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/delete-new")
    public String deletenew(HttpServletRequest request,HttpSession session,@RequestParam("id") String idd) throws SQLException {
        session = request.getSession();
        if(session.getAttribute("admin")!=null) {
            int id = Integer.valueOf(idd);
            new ContenuDao().deleteNew(id);
            return "redirect:/acceuil";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/validerCommentaire")
    public String validercommentaire(@RequestParam("id")String idd){
        int id = Integer.valueOf(idd);
        try{
            new ContenuDao().validerCommentaire(id);
            return "redirect:/comments";
        }catch (Exception e){
            return "redirect:/comments";
        }
    }

    @RequestMapping("/delete-comment")
    public String supprimerCommentaire(@RequestParam("id")String idd){
        int id = Integer.valueOf(idd);
        try{
            new ContenuDao().supprimerCommentaire(id);
            return "redirect:/comments";
        }catch (Exception e){
            return "redirect:/comments";
        }
    }

    @RequestMapping("/logout")
    public String deconnexion(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/login";

    }
}
