package alog.heap;

import java.util.Arrays;

public class PracticeHeap {

    public static void main(String[] args) {
        System.out.println("-------------------------`");
        int[] arry = {10, 20, 30, 25, 5, 40, 35};
        Arrays.stream(arry).forEach(System.out::print);
        System.out.println("");
        minHeapCreation(arry);
        System.out.println("");
        Arrays.stream(arry).forEach(System.out::print);
    }

    private static void minHeapCreation(int[] arry) {
        for (int i = 1; i < arry.length; i++) {
            heapyfy(arry, i);
        }
    }

    private static void heapyfy(int[] arry, int j) {
        while (j > 0) {
            if (j % 2 == 0) {
                if (arry[j] < arry[j / 2 - 1]) {
                    swapIndex(arry, j, (j / 2 - 1));
                }
                j = j / 2 - 1;
            } else {
                if (arry[j] < arry[j / 2]) {
                    swapIndex(arry, j, (j / 2));
                }
                j = j / 2;
            }
        }

    }

    private static void swapIndex(int[] arry, int j, int i) {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }
}
