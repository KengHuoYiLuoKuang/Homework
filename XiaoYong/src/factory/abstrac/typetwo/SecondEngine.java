package factory.abstrac.typetwo;

import factory.abstrac.Engine;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:17
 * Description    :
 */
public class SecondEngine implements Engine {
    @Override
    public void engineInfo() {
        System.out.println("二型引擎。");
    }
}
