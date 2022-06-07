package com.company.lesson1;

public class EmployeeNamePrinter implements Printer {

  public void print(Employee employee) {
    System.out.println("First Name: " + employee.firstName);
    System.out.println("Last Name: " + employee.lastName);
    System.out.println("Position: " + employee.position);
  }

}
