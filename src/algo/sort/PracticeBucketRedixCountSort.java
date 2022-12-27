package algo.sort;

import java.util.Arrays;

public class PracticeBucketRedixCountSort {

    public static void main(String[] args) {
        int[] arryData={6,2,1,5,3,7,8,9};
        Arrays.stream(arryData).forEach(System.out::print);
        System.out.println("");
        countsort(arryData);
    }
    private static void countsort(int[] arryData) {
        int maxValue=0;
        for (int i = 0; i < arryData.length; i++) {
            if (arryData[i] > maxValue)
                maxValue = arryData[i];
        }
        int[] aux = new int[maxValue + 1];
        for (int i = 0; i < arryData.length; i++) {
            int temp = aux[arryData[i]];
            aux[arryData[i]] = temp + 1;//aux[arryData[i]] = ++aux[arryData[i]];
        }
        Arrays.stream(aux).forEach(System.out::print);
        //{6,12,1,6,3,7,8}; -> 0101002110001
        //filling again main array from aux
        int pointer=0;
        for (int j = 0; j < aux.length; j++) {
            int auxTemp = aux[j];
            if (auxTemp >= 1) {
                while (auxTemp >= 1) {
                    arryData[pointer] = j;
                    auxTemp--;
                    pointer++;
                }
            }
        }
        System.out.println("");
        Arrays.stream(arryData).forEach(System.out::print);
    }
}
