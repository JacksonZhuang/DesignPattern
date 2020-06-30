package com.design.pattern.abstractfactory.blackHuman;

import com.design.pattern.abstractfactory.Human;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 黑色人类
 * @version: 1.0
 */
public abstract class AbstractBlackHuman implements Human {

    public void cry() {
        System.out.println("黑色人类会哭");
    }
    public void laugh() {
        System.out.println("黑色人类会笑");
    }
    public void talk() {
        System.out.println("黑色人类可以说话，一般人听不懂");
    }
}
