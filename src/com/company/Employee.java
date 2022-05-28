package com.company;

public class Employee {

  public String firstName;
  public String lastName;
  public int age;
  public String team;
  public long salary;

  public Employee(String firstName, String lastName, int age, String team, long salary) {
    if (salary < 0) {
      System.out.println("Incorrect salary value");
    } else {
      this.salary = salary;
    }
    if (age < 0) {
      System.out.println("Incorrect age value");
    } else {
      this.age = age;
    }
    if (firstName.isEmpty()) {
      System.out.println("First Name cannot be empty");
    }
    if (lastName.isEmpty()) {
      System.out.println("Last Name cannot be empty");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.team = team;
  }

}
