package streamapi;

import dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparing {

    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("----------------");
        List<String> list = List.of("Tousif","abcqwqwqwqwqwqw","cd");
        Comparator<String> comp = (a,b)->a.length()-b.length();
        String maxLength = list.stream().max(comp).get();
        System.out.println(maxLength);
        List<Employee> employeeList = new ArrayList<>();
        //.sorted(Comparator.comparing(Employee::getAddress,Comparator.reverseOrder())).collect(Collectors.toList()));
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getAddress)).collect(Collectors.toList()));


    }
}
