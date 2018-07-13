package com.batch.design.patterns.prototype;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author long bao
 * @Date 19:40 18/7/5
 * @Version 1.0
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
