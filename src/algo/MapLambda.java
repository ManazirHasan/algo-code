package algo;

import java.util.HashMap;
import java.util.stream.Collectors;

public class MapLambda {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("5", "Three");
        map.put("4", "Four");

        map.entrySet().stream().map(x-> x.getValue()).filter(x->x.equalsIgnoreCase("Three")).collect(Collectors.toList()).forEach(System.out::println);
    }
}

enum En {
    SINGLE_INSTANCE;

}

class K<A>{

}