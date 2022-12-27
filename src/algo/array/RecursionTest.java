package algo.array;

import java.io.FileInputStream;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println("------Test-------");
        long start=System.currentTimeMillis();
        fibonici(50);
        long end=System.currentTimeMillis();
        System.out.println("Total time in seconds "+(end-start)/1000*60);
        //FileInputStream
    }

    static int fibonici(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int sum = fibonici(n-1) + fibonici(n - 2);
        //System.out.println("Function call for value of f(n-1) and f(n-2) [ "+n+" ]"+sum);
        return sum;
    }
}
