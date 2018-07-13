package com.batch.design.patterns.visitor;

/**
 * @ClassName VisitorPatternDemo
 * @Description TODO
 * @Author long bao
 * @Date 11:10 18/7/10
 * @Version 1.0
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
