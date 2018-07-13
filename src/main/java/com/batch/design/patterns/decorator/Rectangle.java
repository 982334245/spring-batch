package com.batch.design.patterns.decorator;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author long bao
 * @Date 11:02 18/7/6
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
