package com.batch.design.patterns.facade;

/**
 * @ClassName ShapeMaker
 * @Description TODO
 * @Author long bao
 * @Date 16:24 18/7/5
 * @Version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
