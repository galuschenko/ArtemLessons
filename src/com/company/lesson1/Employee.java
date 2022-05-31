package com.company.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee {

  public String firstName;
  public String lastName;
  public int age;
  public String team;
  public long salary;

  public Employee(String firstName, String lastName, int age, String team, long salary) throws Exception {
    if (salary < 0) {
      throw new Exception("Incorrect salary value");
    } else {
      this.salary = salary;
    }
    if (age < 0) {
      throw new Exception("Incorrect age value");
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
