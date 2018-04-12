package singleton.lazy;

/**
 * @author : XiaoYong
 * Description    :     方法加锁的懒汉模式
 * 优点：线程安全
 * 缺点：每次调用getInstance()方法都要同步，非常耗费资源
 */
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton instance = null;

    private LazySynchronizedSingleton(){}

    public synchronized LazySynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }
}
