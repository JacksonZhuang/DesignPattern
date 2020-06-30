package com.design.pattern.abstractfactory;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.abstractfactory
 * @version: 1.0
 */
public interface HumanFactory {

    //制造黄色人类
    public Human createYellowHuman();

    //制造一个白色人类
    public Human createWhiteHuman();

    //制造一个黑色人类
    public Human createBlackHuman();
}
