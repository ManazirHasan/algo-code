package algo.sort;

public class PracticeSBIShellSort {
    //bubble,selection,insertion
    //quick,merge,heap
    //count sort, redix or bucket/bin sort, shell sort
    public static void main(String[] args) {
        System.out.println("------------this is sorting--------");

        int[] arry={0,-5,-5,2,1,7,8};
        //Arrays.stream(arry).forEach(System.out::print);
        //bubblesort(arry);
    /*    selectionSort(arry);
        System.out.println("");
        Arrays.stream(arry).forEach(System.out::print);*/
        //insertsort
    }



    private static void bubblesort(int[] arry) {
        for (int i=arry.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                swapValue(arry,j,j+1);

            }
        }
    }

    private static void swapValue(int[] ary, int i, int j) {
        if(ary[i]> ary[j]) {
            int temp = ary[i];
            ary[i]= ary[j];
            ary[j]=temp;
        }
    }
    private static void selectionSort(int[] ary) {
        for (int i=0;i<ary.length;i++){
            for (int j=i+1;j<ary.length;j++){
                swapValue(ary, i, j);
            }
        }
    }
}
