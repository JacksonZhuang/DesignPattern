package com.design.pattern.abstractfactory.blackHuman;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 男性黑种人
 * @version: 1.0
 */
public class BlackMaleHuman extends AbstractBlackHuman {

    @Override
    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }
}
