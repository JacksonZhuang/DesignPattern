package com.design.pattern.abstractfactory.yellowHuman;

import com.design.pattern.abstractfactory.yellowHuman.AbstractYellowHuman;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 男性黄种人
 * @version: 1.0
 */
public class YellowMaleHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男....");
    }
}
