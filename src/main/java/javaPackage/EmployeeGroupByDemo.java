package javaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupByDemo {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("John", "IT"));
    employees.add(new Employee("Alice", "HR"));
    employees.add(new Employee("Bob", "IT"));
    employees.add(new Employee("Sarah", "Marketing"));
    employees.add(new Employee("Mike", "HR"));

    Map<String, List<Employee>> employeesByDepartment =
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

    for (String department : employeesByDepartment.keySet()) {
      System.out.println("Department: " + department);
      for (Employee employee : employeesByDepartment.get(department)) {
        System.out.println("  - " + employee.getName());
      }
    }
  }
}

class Employee {
  private String name;
  private String department;

  public Employee(String name, String department) {
    this.name = name;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }
}
