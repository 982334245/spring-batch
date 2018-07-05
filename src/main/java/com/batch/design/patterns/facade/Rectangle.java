package com.batch.design.patterns.facade;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author longbao
 * @Date 16:17
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
