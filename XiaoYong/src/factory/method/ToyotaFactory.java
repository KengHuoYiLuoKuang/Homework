package factory.method;

import factory.car.Toyota;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 17:55
 * Description    :
 */
public class ToyotaFactory implements CarFactory{

    @Override
    public Toyota product() {
        return new Toyota();
    }
}
