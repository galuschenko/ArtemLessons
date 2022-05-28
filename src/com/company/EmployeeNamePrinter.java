package com.company;

public class EmployeeNamePrinter implements Printer{

  public void print(Employee employee) {
    System.out.println("First Name: " + employee.firstName);
    System.out.println("Last Name: " + employee.lastName);
  }

}
