package com.company.lesson1;

public class EmployeeSalaryPrinter implements Printer {

  @Override
  public void print(Employee employee) {
    System.out.println("Salary of " + employee.firstName + " is " + employee.salary);
  };

}
