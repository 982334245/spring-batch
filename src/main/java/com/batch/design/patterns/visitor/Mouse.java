package com.batch.design.patterns.visitor;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Author long bao
 * @Date 11:08 18/7/10
 * @Version 1.0
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
