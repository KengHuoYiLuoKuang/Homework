package factory.abstrac;

import factory.abstrac.typeone.FirstFactory;
import factory.abstrac.typetwo.SecondFactory;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:24
 * Description    :
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory firstFactory = new FirstFactory();
        firstFactory.createEngine().engineInfo();
        firstFactory.createGlass().glassInfo();

        AbstractFactory secondFactory = new SecondFactory();
        secondFactory.createEngine().engineInfo();
        secondFactory.createGlass().glassInfo();

    }
}
