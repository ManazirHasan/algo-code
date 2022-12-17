package algo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestConcent {

    public static void main(String[] args) {
        System.out.println("--------");
        Map<String, String> map = new ConcurrentHashMap<>();
        String str = " test test rtest " +
                "sfsfsd" +
                "sdfsdfsdfsd ";
        //System.out.println(str);
        //System.out.println(str.trim());
        //Employee2 e = null;
        //e.callEmpM();//new java 14 , tell exact variable is numm.
        //String str="""
          //              this is dfdfdfd dfdfd; \
            //            fgdfgdfgdf""";
        int[] x = new int[]{40, 20, 30, 10, 5}; //5,10,20,30,40
        int n = 10;
        Arrays.sort(x);
        Arrays.stream(x).forEach(System.out::println);
        int i = 0;
        while (i < x.length) {
            if (n <= x[i]) {
                break;
            }
            i++;
        }
        if (i < x.length)
            System.out.println(x[i - 1]);

        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();

        for (Integer x1 : l1) {
            if (l2.contains(x1)) {
                //
            }
        }
       /* Map<Integer, Integer> map2 = new HashMap<>();
        int increment = 0;
        for (Integer x2 : l1) {
            if (map2.isEmpty() && map2.containsValue(x2)) {
                //duplicate
            } else {
                map2.put(increment, x2);
            }
        }*/

    }

    private static class Employee2 {
        public void callEmpM() {
        }
    }
}
//

//employeename,


