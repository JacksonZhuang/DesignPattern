package com.design.pattern.strategy;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.strategy
 * @version: 1.0
 */

/**
 * 乘法
 */
public class OperationMul implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
