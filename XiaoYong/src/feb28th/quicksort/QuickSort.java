package feb28th.quicksort;


public class QuickSort {
    private int[] numArr;
    private int length = 0;
    private int count = 1;

    public QuickSort(int[] numArr) {
        this.numArr = numArr;
        this.length = numArr.length;

    }

    public void sort(int low, int high) {
        if (low < high) {
            int bridgeIndex = getBridgeIndex(low, high);
            System.out.println("bridgeIndex :   " + bridgeIndex);
            sort(low, bridgeIndex - 1);
            sort(bridgeIndex + 1, high);
        }
    }

    private int getBridgeIndex(int low, int high) {
        int bridgeValue = numArr[low];
        while (low < high) {
            while (low < high && bridgeValue <= numArr[high]) {
                high--;
            }
            if (low < high) {
                numArr[low] = numArr[high];
            }
            while (low < high && numArr[low] <= bridgeValue) {
                low++;
            }
            numArr[high] = numArr[low];
            numArr[low] = bridgeValue;
        }
        System.out.println("final low:" + low + "   final high:" + high);
        return low;
    }

    public void printArr() {
        for (int n : numArr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
