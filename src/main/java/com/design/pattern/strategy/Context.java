package com.design.pattern.strategy;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.strategy
 * @version: 1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
