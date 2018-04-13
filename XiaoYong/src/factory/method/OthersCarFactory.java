package factory.method;

import factory.car.Car;
import factory.car.OthersCar;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:01
 * Description    :
 */
public class OthersCarFactory implements CarFactory {
    @Override
    public OthersCar product() {
        return new OthersCar();
    }
}
