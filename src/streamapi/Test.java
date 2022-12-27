package streamapi;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    //Get (K,max(v)) value from from Map
    public static void main(String[] args) {
        System.out.println("------------");
        //ball
        String str = "He hit the ball so hard that the ball few away and we lost the ball";
        String[] eachWorkd = str.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : eachWorkd) {
            if (!word.contains("the")) {
                if (map.containsKey(word)) {
                    Integer freq = map.get(word);
                    freq++;
                    map.put(word, freq);
                } else {
                    map.put(word, 1);
                }
            }
        }
        System.out.println(map);
        /*
        Iterator it = map.entrySet().iterator();
        int maxValueInt = 0;
        String keyOfMAx = "";
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            String x = (String) e.getKey();
            Integer maxValue = (Integer) e.getValue();
            if (maxValue > maxValueInt) {
                maxValueInt = maxValue;
                keyOfMAx = x;
            }
        }
        System.out.println(keyOfMAx + "=" + maxValueInt);
        */
        map.entrySet()
                .stream()
                .max((Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> e1.getValue() - e2.getValue())
                .get();
    }
}

/*
 * He hit the ball so hard that the ball few away and we lost the ball.
 *
 * restricted= the , except the work
 *
 *
 * */
