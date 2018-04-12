package singleton.enu;

import io.CopyDirectory;
import singleton.hungry.HungrySingleton;

/**
 * @author : XiaoYong
 * Description    :     懒汉模式
 * 优点：线程安全，可以防止反射，反序列化创建对象
 * 缺点：
 */
public enum EnumSingleton {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
