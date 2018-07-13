package com.batch.design.patterns.decorator;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author long bao
 * @Date 11:02 18/7/6
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
