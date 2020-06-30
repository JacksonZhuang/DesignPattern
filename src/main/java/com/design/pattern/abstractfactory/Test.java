package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.humanFactory.FemaleHumanFactory;
import com.design.pattern.abstractfactory.humanFactory.MaleHumanFactory;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.abstractfactory
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        //第一条生产线，男性生产线
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();

        //第二条生产线，女性生产线
        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();

        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.talk();
        maleYellowHuman.sex();

        femaleYellowHuman.cry();
        femaleYellowHuman.laugh();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();
    }
}
