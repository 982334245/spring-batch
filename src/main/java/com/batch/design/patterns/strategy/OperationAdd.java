package com.batch.design.patterns.strategy;

/**
 * @ClassName OperationAdd
 * @Description TODO
 * @Author long bao
 * @Date 19:20 18/7/5
 * @Version 1.0
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
