package com.design.pattern.abstractfactory.humanFactory;

import com.design.pattern.abstractfactory.Human;
import com.design.pattern.abstractfactory.HumanEnum;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/30
 * @Description: com.design.pattern.abstractfactory.humanFactory
 * @version: 1.0
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    //创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    //创建一个男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
