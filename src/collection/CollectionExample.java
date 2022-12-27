package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectionExample {

    public static void main(String[] args) {
        System.out.println("Inna allaha ma sabireen");
        List test = new ArrayList();
        test.add("One");
        test.add("two");
        test.add("three");
        System.out.println(test);

        //test.sort(Comparator.reverseOrder());
        test= (List) test.stream().sorted().collect(Collectors.toList());
        System.out.println(test);

        test= (List) test.stream().sorted();


        Map<String,String> map = new HashMap<>();
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");



    }
}

class Test {
    public Test() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
