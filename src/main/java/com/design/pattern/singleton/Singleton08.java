package com.design.pattern.singleton;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 单例模式
 * @version: 1.0
 */

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum Singleton08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}
