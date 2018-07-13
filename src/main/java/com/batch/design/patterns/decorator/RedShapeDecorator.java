package com.batch.design.patterns.decorator;

/**
 * @ClassName RedShapeDecorator
 * @Description TODO
 * @Author long bao
 * @Date 11:03 18/7/6
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
