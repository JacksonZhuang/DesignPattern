package com.design.pattern.singleton;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 单例模式
 * @version: 1.0
 */

/**
 * 跟01是一个意思
 */
public class Singleton02 {

    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02() {}

    public static Singleton02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        System.out.println(s1 == s2);
    }
}
