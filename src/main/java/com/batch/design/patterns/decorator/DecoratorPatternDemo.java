package com.batch.design.patterns.decorator;

/**
 * @ClassName DecoratorPatternDemo
 * @Description TODO
 * @Author long bao
 * @Date 11:04 18/7/6
 * @Version 1.0
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
