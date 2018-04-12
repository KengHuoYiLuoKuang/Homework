package singleton.hungry;

/**
 * @author : XiaoYong
 * Description    :     饿汉模式
 * 优点：线程安全
 * 缺点：在类加载时就初始化
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public HungrySingleton getInstance() {
        return instance;
    }
}
