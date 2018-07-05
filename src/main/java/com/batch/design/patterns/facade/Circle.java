package com.batch.design.patterns.facade;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author long bao
 * @Date 18/7/5
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
