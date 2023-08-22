package com.omega.springboot.toDoWebApp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //business logic
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUsername = username.equalsIgnoreCase("Juan");
        boolean isPassword = password.equals("password");

        return isPassword && isValidUsername;
    }

}
