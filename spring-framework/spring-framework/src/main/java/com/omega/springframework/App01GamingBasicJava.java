package com.omega.springframework;

import com.omega.springframework.game.GameRunner;
import com.omega.springframework.game.Pacman;


public class App01GamingBasicJava {
    public static void main(String[] args) {


//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new Pacman();

        var gameRunner = new GameRunner(game);
        //WIRING OF DEPENDENCIES
        //Game is a Dependency of GameRunner class
        //game object created and then wired into gameRunner object

        gameRunner.run();
    }
}
