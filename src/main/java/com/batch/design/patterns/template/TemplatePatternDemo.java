package com.batch.design.patterns.template;

/**
 * @ClassName TemplatePatternDemo
 * @Description TODO
 * @Author long bao
 * @Date 20:14 18/7/5
 * @Version 1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
