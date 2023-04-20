package com.miniprojet.rechauffementclimatique.controllerFront;

import com.miniprojet.rechauffementclimatique.dao.ContenuDao;
import com.miniprojet.rechauffementclimatique.entities.Information;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class FrontOfficeController {

    @RequestMapping("/")
    public String acceuil(ModelMap model) throws SQLException {
        List<Information> list = new ContenuDao().getAllInformations();
        model.addAttribute("informations",list);
        return "frontoffice/index";
    }

}
