package com.batch.design.patterns.template;

/**
 * @ClassName Cricket
 * @Description TODO
 * @Author long bao
 * @Date 20:14 18/7/5
 * @Version 1.0
 */
public class Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
