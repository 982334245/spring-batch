package com.batch.design.patterns.decorator;

/**
 * @ClassName ShapeDecorator
 * @Description TODO
 * @Author long bao
 * @Date 11:02 18/7/6
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
