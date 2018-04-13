package factory.abstrac.typeone;

import factory.abstrac.AbstractFactory;
import factory.abstrac.Engine;
import factory.abstrac.Glass;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:11
 * Description    :
 */
public  class FirstFactory implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new FirstEngine();
    }

    @Override
    public Glass createGlass() {
        return new FirstGlass();
    }
}
