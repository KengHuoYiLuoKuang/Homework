package factory.method;

import factory.car.Byd;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 17:58
 * Description    :
 */
public class BydFactory implements CarFactory{

    @Override
    public Byd product() {
        return new Byd();
    }
}
