package com.batch.design.patterns.factory;

/**
 * Created by longbao on 18/7/5.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
