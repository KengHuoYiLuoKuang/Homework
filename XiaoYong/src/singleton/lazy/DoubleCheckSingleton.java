package singleton.lazy;

/**
 * @author : XiaoYong
 * @date : 2018/4/12 21:12
 * Description    :    双重锁校验
 *
 * 缺点：编码比较复杂
 * 优点：getInstance()方法中两次非空判断可以防止实例对象状态错误，还可以有效减少锁消耗
 *       volatile关键字可以关闭指令重排序，防止getInstance()方法中的锁失效
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
