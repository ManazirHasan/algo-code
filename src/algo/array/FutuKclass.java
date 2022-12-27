package algo.array;

import java.util.*;

public class FutuKclass {

    public static void main(String[] args) throws CloneNotSupportedException {


        FutuKclass futuKclass = new FutuKclass();
        futuKclass.clone();


        int[] x = {6, 2, 1, 5, 8, 9};
        int sum = 13;
        int i = 0;
        Set<Integer> setVal = new HashSet<>();
        Map<Integer,Integer> mapVal = new HashMap();

        int[] j = new int[2];
        while (i < x.length) {
            int diff = sum - x[i];
            if (setVal.isEmpty()) {
                setVal.add(x[i]);
                mapVal.put(x[i], i);
            } else if (!setVal.isEmpty() && setVal.contains(diff)) {
                j[0] = i;
                mapVal.put(x[i], i);
                j[1]= mapVal.get(diff);
                break;
            } else if (!setVal.isEmpty() && !setVal.contains(diff)) {
                setVal.add(x[i]);
                mapVal.put(x[i], i);
            }
            i++;
        }
        for (int g = 0; g < x.length; g++) {
            System.out.print(x[g]);
        }
        System.out.print("\n");
        for (int g = 0; g < j.length; g++)
            System.out.println(j[g]);
        System.out.println(mapVal);
    }



}
