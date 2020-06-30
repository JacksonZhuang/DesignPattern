package com.design.pattern.factorymethod;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 测试
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("------------造出的第一批人是这样的：白色人类 -----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("------------造出的第二批人是这样的：黑色人类 -----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("------------造出的第三批人是这样的：黄色人类 -----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }
}
