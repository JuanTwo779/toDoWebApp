package com.omega.springboot.toDoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
//@RequestParam to take parameters from URL to controller
    //Model (passing in things from controller to jsp)
    //logger to log specific code



    //login => LoginController => login.jsp
    //http://localhost:8080/login
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    //directs user to welcome page when credentials are entered
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String gotoWelcomePage(
            @RequestParam String name, @RequestParam String password,
            ModelMap model){

        //Authentication
        if (authenticationService.authenticate(name, password)){
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }

        model.put("errorMessage", "Invalid Credentials! Please try again");
        return "login";
    }
}
