package singleton.lazy;

/**
 * @author : XiaoYong
 * Description    :     懒汉模式
 *
 * 优点：使用时才加载，节省资源
 * 缺点：线程不安全
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
