package com.omega.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //Spring can create instance of MarioGame
@Primary
public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Accelerate");
    }


}
