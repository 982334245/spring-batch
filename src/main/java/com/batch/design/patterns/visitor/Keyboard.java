package com.batch.design.patterns.visitor;

/**
 * @ClassName Keyboard
 * @Description TODO
 * @Author long bao
 * @Date 11:07 18/7/10
 * @Version 1.0
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
