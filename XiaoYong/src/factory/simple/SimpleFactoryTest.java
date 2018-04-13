package factory.simple;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 17:45
 * Description    :
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        factory.product("Byd").info();

    }
}
