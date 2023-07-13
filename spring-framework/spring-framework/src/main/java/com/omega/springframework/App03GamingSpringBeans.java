package com.omega.springframework;

import com.omega.springframework.game.GameRunner;
import com.omega.springframework.game.GamingConsole;
import com.omega.springframework.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        //GameRunner and game are Spring Beans
        //We pick the beans via Spring context and running them

        try (var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class)) {

            System.out.println(context.getBean(GamingConsole.class));
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }
}
