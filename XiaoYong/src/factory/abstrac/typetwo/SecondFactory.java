package factory.abstrac.typetwo;

import factory.abstrac.AbstractFactory;
import factory.abstrac.Engine;
import factory.abstrac.Glass;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:19
 * Description    :
 */
public class SecondFactory implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new SecondEngine();
    }

    @Override
    public Glass createGlass() {
        return new SecondGlass();
    }
}
