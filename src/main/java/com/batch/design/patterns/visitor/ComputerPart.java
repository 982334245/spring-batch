package com.batch.design.patterns.visitor;

/**
 * @ClassName ComputerPart
 * @Description TODO
 * @Author long bao
 * @Date 11:06 18/7/10
 * @Version 1.0
 */
public interface ComputerPart {
    /**
     * TODO
     * @Author lb
     * @Date 11:11 18/7/10
     * @Param [computerPartVisitor]
     * @return void
     **/
    void accept(ComputerPartVisitor computerPartVisitor);
}
