package algo.sort;

import java.util.Arrays;

public class PracticeQuickHeapMergeSort {

    public static void main(String[] args) {
        System.out.println("-----------------------");
        //int[] arryData={6,2,1,5,3,7,8,9};
        int[] arryData={50,70,60,90,40,80,10,20,30};
        Arrays.stream(arryData).forEach(System.out::print);
        System.out.println("");
        //heapsort(arryData);
        quicksort(arryData,1,arryData.length-1);
        Arrays.stream(arryData).forEach(System.out::print);
        System.out.println("");
        //mergesort(arryData);
    }

    private static int partition(int[] arryData,int i, int j) {
        int pivot = arryData[i-1];
        int pivotIndex=i-1;
        while(i<=j){
            int x = arryData[i];
            int y=arryData[j];
            if(!(x>pivot)){
                    i++;
            }if(!(y<pivot)){
                    j--;
            }if(x>pivot && y<pivot){
                swapArrayIndex(arryData,i,j);
                i++;
                j--;
            }
            if(i>=j){
                //swap pivot with j-1 and
                //now pivot is at shorted position , all left from pivot is smaller and all right from pivot is higher;
                swapArrayIndex(arryData,pivotIndex,j);
            }

        }
        return j;
    }

    private static void quicksort(int[] arryData, int i, int j){
        if(i<j) {
            int pivot= partition(arryData, i, j);
            quicksort(arryData, i, pivot);
            quicksort(arryData, pivot+1, j);
        }
    }

    private static void heapsort(int[] arryData) {

    }

    static void swapArrayIndex(int[] arry, int i, int j) {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;

    }
}
