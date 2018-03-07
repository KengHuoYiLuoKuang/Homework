package feb28th.myarraylist;

import java.util.Arrays;

 /**
    *    @author  : XiaoYong
    *    @date    : 2018/3/5 17:22
    *    Description    :
    */

public class MyArrayList<T> {
    private Object[] elements = new Object[10];
    private int point = 0;
    private int size = elements.length;
//    private T[] e = (T[])new Object[10];

    public void add(T t) {
        if (point >= size) {
            increaseSize();
        }
        elements[point] = t;
//        System.out.println("elements[ " + point + " ] 添加一个 " + t.getClass().getSimpleName());
        point++;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
//            System.out.println(elements[index].getClass().getSimpleName());
            //编译器发出了警告，但其实并无危险，因为elements[]中的元素本来就是T类型
            return (T) elements[index];
        }
        throw new ArrayIndexOutOfBoundsException("Max index is : "
                + (size - 1) + " . Your index is : " + index);
    }

    private void increaseSize() {
        size += 5;
        elements = Arrays.copyOf(elements, size);
    }
}
