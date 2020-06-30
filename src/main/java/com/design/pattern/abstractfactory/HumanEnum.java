package com.design.pattern.abstractfactory;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 世界上有哪些类型的人，列出来
 * @version: 1.0
 */
public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YellowMaleHuman("com.design.pattern.abstractfactory.yellowHuman.YellowMaleHuman"),
    YellowFemaleHuman("com.design.pattern.abstractfactory.yellowHuman.YellowFemaleHuman"),
    WhiteFemaleHuman("com.design.pattern.abstractfactory.whiteHuman.WhiteFemaleHuman"),
    WhiteMaleHuman("com.design.pattern.abstractfactory.whiteHuman.WhiteMaleHuman"),
    BlackFemaleHuman("com.design.pattern.abstractfactory.blackHuman.BlackFemaleHuman"),
    BlackMaleHuman("com.design.pattern.abstractfactory.blackHuman.BlackMaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
