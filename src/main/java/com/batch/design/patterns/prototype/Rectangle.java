package com.batch.design.patterns.prototype;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author long bao
 * @Date 19:38 18/7/5
 * @Version 1.0
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
