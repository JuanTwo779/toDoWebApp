package com.omega.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Spring can create instance of GameRunner
public class GameRunner {

    private GamingConsole game;

    //auto wires by use of constructor/qualifier
    public GameRunner(@Qualifier("PacmanQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
