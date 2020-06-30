package com.design.pattern.abstractfactory.whiteHuman;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 女性白种人
 * @version: 1.0
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {

    @Override
    public void sex() {
        System.out.println("该白种人的性别为女....");
    }
}
