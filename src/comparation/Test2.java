package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
      List<Employee> list = new ArrayList<>();
      Employee emp1 = new Employee(100, "Daria", "Smirnova", 1234);
      Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
      Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);

      list.add(emp1);
      list.add(emp2);
      list.add(emp3);
      System.out.println("Before sorting \n" + list);
      Collections.sort(list);
      System.out.println("After sorting \n" + list);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

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
//        if(this.id == anotherEmp.id) {
//            return 0;
//        }
//        else if (this.id< anotherEmp.id) {
//            return -1;
//        }
//        else {
//            return 1;
//        }
        return this.id-anotherEmp.id;
    }
}
