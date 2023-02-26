package streamapi;

import collection.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PDuplicateFromListUsingJava8 {

    public static void main(String[] args) {
        System.out.println("----------");
        List<Integer> list = List.of(-1,1,2,3,4,6,3,2);
        sumOfElements(list);

/*        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(list);
        list.stream().
                filter(i->Collections.frequency(list,i)>1)
                .collect(Collectors.toSet()).forEach(System.out::print);*/
    }

    private static void sumOfElements(List<Integer> list) {

        Integer sumOfInt = list.stream().mapToInt(x->x.intValue()).sum();
        System.out.println(sumOfInt);
        Integer sum = list.stream().reduce(0,(a, b)->a+b);
        System.out.println(sum);
        //https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
        Integer sumOFEle = list.stream().reduce(0,Integer::sum);
        System.out.println(sumOFEle);
        Integer maxOfEle = list.stream().reduce(0,Integer::max);
        System.out.println(maxOfEle);

        Integer minOfEle = list.stream().reduce(9999,Integer::min);
        System.out.println(minOfEle);
        //Employee
        Widget widget1 = new Widget("A",1);
        Widget widget2 = new Widget("B",2);
        List<Widget> widgets = new ArrayList<>();
        widgets.add(widget1);
        widgets.add(widget2);
        //
        int sumOfWeights= widgets.stream().reduce(0,(a,b)->a+b.getWeight(),Integer::sum).intValue();
        System.out.println(sumOfWeights);
        int sumMap = widgets.stream().mapToInt(x->x.getWeight()).sum();
        System.out.println(sumMap);
        //String concatenated = strings.reduce("", String::concat)
    }
}
