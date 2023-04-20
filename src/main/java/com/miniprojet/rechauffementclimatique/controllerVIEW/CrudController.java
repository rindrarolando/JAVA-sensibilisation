package com.miniprojet.rechauffementclimatique.controllerVIEW;

import com.miniprojet.rechauffementclimatique.dao.ContenuDao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class CrudController {

    @RequestMapping (value = "/upload-information", method = RequestMethod.POST)
    public String handleFileUpload_information(@RequestParam("titre") String titre, @RequestParam("url") String url, @RequestParam("description") String description, @RequestParam("photo") String photo ) {


        try {
            new ContenuDao().insertInformation(titre,url,description,photo);
            return "redirect:/add-information";

        } catch (Exception e) {
            return "redirect:/add-information";
        }
    }

    @RequestMapping(value = "/upload-new", method = RequestMethod.POST)
    public String handleFileUpload_new(@RequestParam("titre") String titre,@RequestParam("url") String url,@RequestParam("description") String description,@RequestParam("photo") String photo ) {

        try {
            new ContenuDao().insertNew(titre,description,photo,url);
        } catch (Exception e) {
            return "redirect:/add-new";
        }
        return "redirect:/add-new";
    }
}
