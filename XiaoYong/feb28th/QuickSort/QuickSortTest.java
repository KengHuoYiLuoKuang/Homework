package basestone.practice.feb28th;

import java.util.Random;

public class QuickSortTest {
    public static void main(String[] args) {
        String[] strings = new String[]{"AC", "AB", "k", "aB", "Da", "Vx", "A"};
        GenericQuickSort.sort(strings, 0, strings.length - 1);
        GenericQuickSort.printArr(strings);
        System.out.println("\n\n");

        int integersLength = 20;
        Random random = new Random();
        Integer[] integers = new Integer[integersLength];
        for (int i = 0; i < integersLength; i++) {
            integers[i] = (int) (random.nextInt(100000));
        }
        GenericQuickSort.sort(integers, 0, integers.length - 1);
        GenericQuickSort.printArr(integers);
    }
}
