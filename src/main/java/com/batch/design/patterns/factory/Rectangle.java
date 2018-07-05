package com.batch.design.patterns.factory;

/**
 * Created by longbao on 18/7/5.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
