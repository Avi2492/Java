import java.util.*;

class Employee {
    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Employee{" + "name=" + name + ", id= " + id + '}';
    }
}

public class TreeWithCustomObj {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Avinash", "1230");
        Employee emp2 = new Employee("Harleen", "1433");
        Employee emp3 = new Employee("Shivam", "1650");

        Set<Employee> treeSet = new TreeSet<Employee>(new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        System.out.println("treeSet: " + treeSet);
    }
}
