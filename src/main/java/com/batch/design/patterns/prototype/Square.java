package com.batch.design.patterns.prototype;

/**
 * @ClassName Square
 * @Description TODO
 * @Author long bao
 * @Date 19:39 18/7/5
 * @Version 1.0
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
