package com.design.pattern.abstractfactory.yellowHuman;

import com.design.pattern.abstractfactory.Human;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 黄色人类
 * @version: 1.0
 */
public abstract class AbstractYellowHuman implements Human {

    public void cry() {
        System.out.println("黄色人类会哭");
    }

    public void laugh() {
        System.out.println("黄色人类会大笑，幸福呀！ ");
    }
    public void talk() {
        System.out.println("黄色人类会说话，一般说的都是双字节");
    }
}
