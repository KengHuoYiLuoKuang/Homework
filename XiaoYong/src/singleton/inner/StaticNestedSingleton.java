package singleton.inner;

/**
 * @author : XiaoYong
 * Description    :     静态内部类单例
 * 优点：实现了懒加载,节省资源；线程安全
 * 缺点：需要额外的工作防止反序列化、反射创建对象
 */
public class StaticNestedSingleton {

    private StaticNestedSingleton(){}

    private static class SingletonHandler {
        private static final StaticNestedSingleton INSTANCE = new StaticNestedSingleton();
    }

    public static StaticNestedSingleton getInstance() {
        return SingletonHandler.INSTANCE;
    }
}
