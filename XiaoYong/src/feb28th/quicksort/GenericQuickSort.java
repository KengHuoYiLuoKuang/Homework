package feb28th.quicksort;

//限定 T 为实现了 Comparable<> 接口的类
// 或是实现了 Comparable<> 接口的类的子类
public class GenericQuickSort {

    public static <T extends Comparable<T>> void sort(T[] arr, int low, int high) {
        if (low < high) {
            int bridgeIndex = getBridgeIndex(arr, low, high);
            sort(arr, low, bridgeIndex - 1);
            sort(arr, bridgeIndex + 1, high);
        }
    }

    private static  <T extends Comparable<T>> int getBridgeIndex(T[] arr, int low, int high) {
        T temp;
        T bridgeValue = arr[low];
        while (low < high) {
            //自后向前遍历直到high减到等于low，或者遇到比bridgeValue小的数
            while (low < high && (bridgeValue.compareTo(arr[high])) < 0) {
                high--;
            }
            //退出while的条件要么是high = low，要么就是遇到了小于bridgeValue的数
            if (low < high) {
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            //自前向后遍历直到low加到等于high，或者遇到比bridgeValue大的数
            while (low < high && (bridgeValue.compareTo(arr[low])) >= 0) {
                low++;
            }
            //退出while的条件要么是low = high，要么就是遇到了大于bridgeValue的数
            if (low < high) {
                temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
        }
        }
        //返回low或者high是一样的，因为这个时候它们已经相等了
        return low;
    }

    public static <T extends Comparable<T>> void printArr(T[] arr) {
        System.out.print("    ");
        for (T n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
