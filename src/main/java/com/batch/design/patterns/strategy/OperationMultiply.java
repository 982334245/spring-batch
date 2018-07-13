package com.batch.design.patterns.strategy;

/**
 * @ClassName OperationMultiply
 * @Description TODO
 * @Author long bao
 * @Date 19:21 18/7/5
 * @Version 1.0
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
