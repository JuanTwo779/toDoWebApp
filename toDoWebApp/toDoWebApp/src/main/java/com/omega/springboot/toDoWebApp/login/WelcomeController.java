package com.omega.springboot.toDoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    //@RequestParam to take parameters from URL to controller
    //Model (passing in things from controller to jsp)
    //logger to log specific code
    //SessionAttributes - remembers attributes to be used by other controllers

    //http://localhost:8080
    //GET retrieve data from server
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model){
        model.put("name", "juan");
        return "welcome";
    }



}
