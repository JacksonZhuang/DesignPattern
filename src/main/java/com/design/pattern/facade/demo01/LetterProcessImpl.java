package com.design.pattern.facade.demo01;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: 写信的具体实现了
 * @version: 1.0
 */
public class LetterProcessImpl implements LetterProcess {

    //写信
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    //在信封上填写必要的信息
    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名...." + address);
    }

    //把信放到信封中，并封好
    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中....");
    }

    //塞到邮箱中，邮递
    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
