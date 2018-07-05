package com.batch.design.patterns.bridge;

/**
 * Created by longbao on 18/7/5.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
