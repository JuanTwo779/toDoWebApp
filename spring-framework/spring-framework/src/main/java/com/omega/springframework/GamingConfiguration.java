package com.omega.springframework;

import com.omega.springframework.game.GameRunner;
import com.omega.springframework.game.GamingConsole;
import com.omega.springframework.game.MarioGame;
import com.omega.springframework.game.Pacman;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Qualifier("pacmanQualifier")
    public GamingConsole game () {
        var game = new Pacman();
        return game;
    }

    @Bean
    @Primary
    public GamingConsole game2() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(@Qualifier("pacmanQualifier") GamingConsole game) {
        return new GameRunner(game);
    }


}
