package factory.simple;

import factory.car.Byd;
import factory.car.Car;
import factory.car.OthersCar;
import factory.car.Toyota;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 17:21
 * Description    :
 */
public class CarFactory {
    public Car product(String type) {
        Car car = null;
        if ("Toyota".equals(type)) {
            return new Toyota();
        } else if ("Byd".equals(type)) {
            return new Byd();
        } else {
            return new OthersCar();
        }
    }
}
