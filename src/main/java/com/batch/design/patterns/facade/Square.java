package com.batch.design.patterns.facade;

/**
 * @ClassName Square
 * @Description TODO
 * @Author long bao
 * @Date 16:20
 * @Version 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
