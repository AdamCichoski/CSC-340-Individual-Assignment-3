package com.csc340.individualAssignment3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /**
     * Mapping to the home page
     * Displays the page containing a general welcome to the company
     * @return index html file
     */
    @GetMapping("/home")
    public String homePage(){
        return "index";
    }

    /**
     * Mapping to the about page
     * Displays the page containing information about the company
     * Our Story
     *
     * @return about html
     */
    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    /**
     * Mapping to the contact page
     * Displays the page containing information about the company
     * Scheduling an appointment
     * Founder image
     * @return
     */
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @GetMapping("/error")
    public String errorPage(){
        return "error";
    }
}
