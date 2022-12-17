package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestKlassNC {

    final static List<Integer> list = new ArrayList<>();
    //Arrays.asList(1,2,3,4);
    private static List<Integer> getList(){
        return list;
    }
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        final List<Integer> asList= getList();
        asList.add(5);
        //asList= null;
        final List<Integer> asList2= getList();
        asList2.add(6);
        System.out.println(asList);
        System.out.println(asList2);
        int a = 123;
        A x =null;
        //a = update(a,x);
        //System.out.println(a);

        //final List<String> intList = Arrays.asList(1,2,3);
        //intList.add(4);
        //System.out.println(intList);
    }

    class A{

    }

    private static int update(int a,A x ) {
        return 4;
    }
}
