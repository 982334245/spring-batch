package com.batch.design.patterns.template;

/**
 * @ClassName Football
 * @Description TODO
 * @Author long bao
 * @Date 20:14 18/7/5
 * @Version 1.0
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
