package com.wyy;

import java.util.Comparator;

public class QkSort {

    public static void sortt(Object[] a, int s, int e, Comparator comparator) {  //快速排序算法
        int start = s;        //左指针
        int end = e;          //右指针
        Object mark = a[s];     //确定快速排序的中间值 key
        Object temp;            // 数据两两交换的临时变量

        while (start < end) {
            while (start < end && (comparator.compare(a[end], mark) == 1 || comparator.compare(a[end], mark) == 0)) //调用重写的sort方法判断大小
                end--;

            if (comparator.compare(a[end], mark) == -1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            while (start < end && (comparator.compare(a[start], mark) == -1 || comparator.compare(a[start], mark) == 0))//调用重写的sort方法判断大小
                start++;

            if (comparator.compare(a[start], mark) == 1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }

        }
        if (start > s) {
            sortt(a, s, start - 1, comparator);  //递归  左半边再进行快速排序
        }
        if (end < e) {
            sortt(a, end + 1, e, comparator);  //递归  右半边再进行快速排序
        }
    }
}
