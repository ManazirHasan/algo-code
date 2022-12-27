package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestList {

    public static void main(String[] args) {

        //max,min.2nd highest or 3rd highest,2nd highest

        //maxMinOr2ndHighest();
        //2nd highest salary without Comparator implementation
        secoundHighestSalary();

        //highest salary from each department
        highestSalaryFromEachDept(); //?

        //Map iterate using java8
        iterateMapUsingJava8(); //?


    }

    private static void iterateMapUsingJava8() {
    }


    private static void secoundHighestSalary() {
        List<Employee> employeeList = buildEmployee();
        //System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getAddress,Comparator.reverseOrder())).collect(Collectors.toList()));
        //System.out.println(employeeList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList()));
        System.out.println(employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(1).findFirst().get());
    }

    private static List<Employee> buildEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Manazir", 20l, "Bang", "d1"));
        list.add(new Employee(2, "Rajesh", 10l, "Manglore", "d2"));
        list.add(new Employee(3, "Mukhtar", 30l, "Kolka", "d1"));
        list.add(new Employee(4, "Abishek", 50l, "Andhra", "d1"));
        list.add(new Employee(5, "Shahid", 60l, "Orisa", "d2"));
        list.add(new Employee(6, "Arshad", 100l, "Mumbai", "d3"));
        return list;
    }

    private static void maxMinOr2ndHighest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2);
        list.add(300);
        list.stream().forEach(System.out::print);
        System.out.println("");
        //System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        //System.out.println(list.stream().min(Comparator.naturalOrder()).get());
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList()));
        //System.out.println(list.stream().sorted().skip(1).().get());
    }
    private static void highestSalaryFromEachDept() {

    }

    private static class Employee {
        Integer id;
        String name;
        String address;
        Long salary;

        String dept;

        public Employee(Integer id, String name, Long salary, String address, String dept) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.address = address;
            this.dept = dept;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
