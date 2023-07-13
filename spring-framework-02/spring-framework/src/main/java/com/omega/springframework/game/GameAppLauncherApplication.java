package com.omega.springframework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.omega.springframework.game") //auto scans current package
public class GameAppLauncherApplication {


    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext
                (GameAppLauncherApplication.class)) {

            //auto-wires via component scan
            System.out.println(context.getBean(GamingConsole.class));
            context.getBean(GamingConsole.class).up();

            //Spring creates a gameRunner.
            //gameRunner needs a gameConsole
            //Spring creates an instance of a class that implements gameConsole
            context.getBean(GameRunner.class).run();
        }

    }
}



