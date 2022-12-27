package collection;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Shahid","Pune"));
        employeeList.add(new Employee(2,"Manazir","Banglore"));
        employeeList.add(new Employee(3,"Arshads","Mumbai"));

        NameComparator nameComparator= new NameComparator();
        //Collections.sort(employeeList,Comparator.naturalOrder());
        Collections.sort(employeeList,nameComparator);
        //Collections.sort(employeeList);
        TreeMap tmap = new TreeMap();

        //Collections.sort(employeeList,nameComparator);
        employeeList.stream().forEach(System.out::println);

        String[] strings = {"hello", "educative", "edpresso"};
        System.out.println("Array before sorting: " + Arrays.toString(strings));
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.naturalOrder());

        List<Integer>  listOfInt= new ArrayList<>();
        listOfInt.add(10);
        listOfInt.add(3);
        listOfInt.add(7);
        listOfInt.add(5);
        listOfInt.add(12);
        //listOfInt.add(null);
        listOfInt.sort(Comparator.naturalOrder());
        Collections.sort(listOfInt);
        //Collections.sort(listOfInt,Comparator.naturalOrder());
        listOfInt.stream().forEach(System.out::println);

    }
}

