package factory.abstrac.typeone;

import factory.abstrac.Glass;

/**
 * @author : XiaoYong
 * @date : 2018/4/13 18:18
 * Description    :
 */
public class FirstGlass implements Glass {
    @Override
    public void glassInfo() {
        System.out.println("一型玻璃。");
    }
}
