package com.batch.design.patterns.factory;


/**
 * Created by longbao on 18/7/5.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
