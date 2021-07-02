package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Daria", "Smirnova", 1);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 2);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 4);
        Employee emp4 = new Employee(120, "Ivan", "Sidorov", 3);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);

        // {100 15} 123 100 123 15
        // 1
        // 15 {100 123} 100 123 15
        // -1
        // 15 100 {123 100} 123 15
        // 1
        // 15 100 100 {123 123} 15
        // 0
        // 15 100 100 123 {123 15}
        // 1
        // {15 100} 100 123 15 | 123
        // -1
        // 15 {100 100} 123 15 | 123
        // 0
        // 15 100 {100 123} 15 | 123
        // -1
        // 15 100 100 {123 15} | 123
        // 1
        // {15 100} 100 15 | 123 123
        // -1
        // 15 {100 100} 15 | 123 123
        // 0
        // 15 100 {100 15} | 123 123
        // 1
        // {15 100} 15 | 100 123 123
        // -1
        // 15 {100 15} | 100 123 123
        // 1
        // {15 15} |100 100 123 123
        // 0
        // 15 | 15 100 100 123 123
        // 15 15 100 100 123 123

    }
}

class Employee implements Comparable<Employee> {

//    int id;
    Integer id;
    String name;
    String surname;
    Integer salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee anotherEmp) {

//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }

//          return this.id-anotherEmp.id;
//
//          return this.id.compareTo(anotherEmp.id);

//        return this.name.compareTo(anotherEmp.name);

        int result = this.name.compareTo(anotherEmp.name);
        if (result==0) {
            result = this.surname.compareTo(anotherEmp.surname);
            if (result == 0) {
                result = this.salary.compareTo(anotherEmp.salary);
            }
        }
        return result;
    }
}
