package com.design.pattern.factorymethod;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 女娲生产人的工厂
 * @version: 1.0
 */
public class HumanFactory {

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！ ");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！ ");
        }
        return human;
    }
}
