package com.design.pattern.abstractfactory.yellowHuman;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 女性黄种人
 * @version: 1.0
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
