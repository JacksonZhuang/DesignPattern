package com.design.pattern.abstractfactory.blackHuman;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 女性黑种人
 * @version: 1.0
 */
public class BlackFemaleHuman extends AbstractBlackHuman {

    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
