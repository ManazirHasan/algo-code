package algo.array;

import java.util.HashMap;
import java.util.Map;

public class StringTestFrequency {

    public static void main(String[] args) {
        String input ="abbbccdddd";
        //String output - a1b3c2d4;
        char[] x = input.toCharArray();
        int i=0;
        Map<String,Integer> map = new HashMap<>();
        while (i<x.length){
            if(!map.isEmpty()&& map.containsKey(String.valueOf(x[i]))){
                int increment = map.get(String.valueOf(x[i]));
                increment = increment+1;
                map.put(String.valueOf(x[i]),increment);
            }else {
                map.put(String.valueOf(x[i]),1);
            }
            i++;

        }
        System.out.println(map);
    }
}
