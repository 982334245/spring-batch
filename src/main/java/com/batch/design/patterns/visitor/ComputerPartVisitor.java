package com.batch.design.patterns.visitor;

/**
 * @ClassName ComputerPartVisitor
 * @Description TODO
 * @Author long bao
 * @Date 11:06 18/7/10
 * @Version 1.0
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
