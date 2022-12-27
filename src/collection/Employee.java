package collection;


public class Employee {//implements Comparable<Employee> {
    public Employee(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    Integer id;
    String name;
    String address;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

   /* @Override
    public int compareTo(Employee o) {
        return this.getAddress().compareTo(o.getAddress());
    }*/
}
