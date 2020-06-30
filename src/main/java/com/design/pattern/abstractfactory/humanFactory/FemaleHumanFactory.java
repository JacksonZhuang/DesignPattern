package com.design.pattern.abstractfactory.humanFactory;

import com.design.pattern.abstractfactory.Human;
import com.design.pattern.abstractfactory.HumanEnum;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.abstractfactory.humanFactory
 * @version: 1.0
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    //创建一个女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    //创建一个女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
