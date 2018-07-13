package com.batch.design.patterns.template;

/**
 * @ClassName Game
 * @Description TODO
 * @Author long bao
 * @Date 20:13 18/7/5
 * @Version 1.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
