package com.design.pattern.singleton;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 单例模式
 * @version: 1.0
 */

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03() {}

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
