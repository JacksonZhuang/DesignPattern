package com.design.pattern.facade.demo02;

import com.design.pattern.facade.demo01.LetterProcess;
import com.design.pattern.facade.demo01.LetterProcessImpl;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.facade.demo02
 * @version: 1.0
 */
public class ModernPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    //写信，封装，投递，一体化了
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);

        //写好信封
        letterProcess.fillEnvelope(address);

        //把信放到信封中
        letterProcess.letterIntoEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }
}
