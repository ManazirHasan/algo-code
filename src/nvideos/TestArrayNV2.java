package nvideos;

import java.util.Arrays;

public class TestArrayNV2 {

    public static void main(String[] args) {
        System.out.println("-----Array--------------");
        int[] arry={2,3,4,5,6};
        multiplicationOfConsequetiveIndex(arry);
        //power of 2
        // find any number is duplicate or not in an array
        //last question is important-replace if max is right in array
    }

    private static void multiplicationOfConsequetiveIndex(int[] arry) {
        Arrays.stream(arry).forEach(System.out::print);
        System.out.println("");
        int temp=0;
        for(int i = 0; i< arry.length; i++){
            if (i == 0) {
                int temp2 = arry[i];
                arry[i] = arry[i] * arry[i + 1];
                temp=temp2;
            } else if (i == arry.length - 1) {
                arry[i] = temp * arry[i];
            } else{
                int temp2 = arry[i];
                arry[i] = temp * arry[i + 1];
                temp=temp2;
            }
        }
        Arrays.stream(arry).forEach(System.out::print);
    }
}
