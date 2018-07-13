package com.batch.design.patterns.strategy;

/**
 * @ClassName Context
 * @Description TODO
 * @Author long bao
 * @Date 19:22 18/7/5
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
