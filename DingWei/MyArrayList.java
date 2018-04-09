package com.issc.ding.myarraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<E> {
    private final static int DEFAULT_SIZE = 10;

    private int size;

    private E[] target;

    private MyArrayList() {
    }

    /**
     * 向集合中添加元素
     * @param e 元素
     */
    private void add(E e){
        if(target==null) {
            //利用反射创建数组
            target = (E[]) Array.newInstance(e.getClass(), DEFAULT_SIZE);
        }
        if(this.size < DEFAULT_SIZE){
            //小于默认尺寸10
            target[size++] = e;
        }else{
            //大于10的时候需要扩容,
            //copyOf复制指定的数组到新数组，第一个参数为原数组，第二个参数为新数组长度
            target = Arrays.copyOf(target, size*2);
            target[size++] = e;
        }
    }

    /**
     * 根据下标获取集合中的元素
     * @param index 下标
     */
    private E get(int index){
        return target[index];
    }

    /**
     * 返回集合长度
     */
    public int size(){
        return this.size;
    }

    public static void main(String[] args) {
        MyArrayList<String> myArrayList=new MyArrayList<>();
        myArrayList.add("1");
        myArrayList.add("ok");
        myArrayList.add("perfect");
        for(int i=0;i<myArrayList.size;i++){
            System.out.println(myArrayList.get(i));
        }
    }
}
