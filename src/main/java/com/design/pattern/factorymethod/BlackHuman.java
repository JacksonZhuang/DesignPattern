package com.design.pattern.factorymethod;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 黑色人类
 * @version: 1.0
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑色人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑色人类可以说话，一般人听不懂");
    }
}
