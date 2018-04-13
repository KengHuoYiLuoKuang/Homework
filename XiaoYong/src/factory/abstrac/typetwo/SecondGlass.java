package factory.abstrac.typetwo;

import factory.abstrac.Glass;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:18
 * Description    :
 */
public class SecondGlass implements Glass {
    @Override
    public void glassInfo() {
        System.out.println("二型玻璃。");
    }
}
