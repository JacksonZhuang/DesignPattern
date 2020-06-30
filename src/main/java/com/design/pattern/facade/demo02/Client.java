package com.design.pattern.facade.demo02;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 我开始给朋友写信了
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModernPostOffice helloRoadPostOffice = new ModernPostOffice();

        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        String address = "Happy Road No. 666,God Province,Heaven"; //定义一个地址
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        helloRoadPostOffice.sendLetter(context, address);
    }
}
