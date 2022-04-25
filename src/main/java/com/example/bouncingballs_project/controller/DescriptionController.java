package com.example.bouncingballs_project.controller;

import com.example.bouncingballs_project.model.Images;
import com.example.bouncingballs_project.services.DescriptionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DescriptionController {

    @Autowired
    private DescriptionServices descriptionServices;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }


    @GetMapping("/image")
    public String image(Model model) {
        List<Images> imageList = descriptionServices.fetchAll(); //create the list of users @fetchAll() - add them to the model
        model.addAttribute("images", imageList);
        return "home/image";
    }

    @GetMapping("/about")
            public String about() {
    return "home/about";
    }

        @GetMapping("/code")
        public String code () {
            return "home/code";
        }

    }

   /* @PostMapping("/code")
    public String code(@ModelAttribute Images image) {
        descriptionServices.code(image);
        return "redirect:/";
    }*/


