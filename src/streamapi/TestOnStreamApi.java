package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;

public class TestOnStreamApi {

    public static void main(String[] args) {
        System.out.println("--------");
        List<Emp> empList = employeeBuilderWithDeparment();
        groupByOnDepartment(empList);
    }
    private static void groupByOnDepartment(List<Emp> empList) {
        Map<String, Set<Long>> salaryOnEachDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartName, Collectors.mapping(Emp::getSalary, toSet())));
        //System.out.println(salaryOnEachDept);
        Map<String, Emp> maxSalaryOnEachDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartName, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Emp::getSalary)),Optional::get)));
        //System.out.println(maxSalaryOnEachDept);
        Map<String, Long> sumOfSalaryOnEachDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartName, Collectors.summingLong(Emp::getSalary)));
        Map<String, Long> countOnEachDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartName, Collectors.counting()));
        Map<String, List<Emp>> empListOnEachDept = empList.stream().collect(Collectors.groupingBy(Emp::getDepartName, Collectors.toList()));
        System.out.println(empListOnEachDept);
    }

    private static List<Emp> employeeBuilderWithDeparment() {
        List<Emp> empList = new ArrayList<>();
        Emp emp1 = new Emp(1, "d1", 5000l);
        empList.add(emp1);
        Emp emp2 = new Emp(2, "d2", 1000l);
        empList.add(emp2);
        Emp emp3 = new Emp(3, "d1", 2000l);
        empList.add(emp3);
        Emp emp4 = new Emp(4, "d2", 1500l);
        empList.add(emp4);
        return empList;
    }

}


class Emp {

    int id;
    String departName;
    Long salary;

    public Emp(int id, String departName, Long salary) {
        this.id = id;
        this.departName = departName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "streams.Emp{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
