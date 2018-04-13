package factory.method;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:02
 * Description    :
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory bydFactory = new BydFactory();
        bydFactory.product().info();

        CarFactory toyotaFactory = new ToyotaFactory();
        toyotaFactory.product().info();

        CarFactory othersFactory = new OthersCarFactory();
        othersFactory.product().info();
    }
}
