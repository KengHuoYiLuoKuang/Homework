package factory.abstrac.typeone;

import factory.abstrac.Engine;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:14
 * Description    :
 */
public class FirstEngine implements Engine {
    @Override
    public void engineInfo() {
        System.out.println("一型引擎。");
    }
}
