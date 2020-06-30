package com.design.pattern.strategy;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.strategy
 * @version: 1.0
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context;
        System.out.println("---------加法---------");
        context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        System.out.println("---------减法---------");
        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        System.out.println("---------乘法---------");
        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
