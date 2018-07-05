package com.batch.design.patterns.facade;

/**
 * @ClassName FacadePatternDemo
 * @Description TODO
 * @Author long bao
 * @Date 16:24 18/7/5
 * @Version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
