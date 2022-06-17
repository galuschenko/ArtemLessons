package com.company.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Employee {

  public String firstName;
  public String lastName;
  public int age;
  public String team;
  public long salary;
  public POSITION position;

  public Employee(String firstName, String lastName, int age, String team, POSITION position)
      throws Exception {
    this(firstName, lastName, age, team, 0, position);
  }


  public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) throws Exception {
    if (salary <= 0) {
      salary = position.minSalary;
    }
    this.salary = salary;

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
    this.position = position;
  }

  public String toString() {
    return "Empoloyee info: " + this.firstName + " " + this.lastName + " " + this.position.toString();
  }

  public boolean equals(Object obj) {
    return obj instanceof Employee
        && ((Employee) obj).firstName.equals(this.firstName)
        &&((Employee) obj).lastName.equals(this.lastName);
  }

  public void work() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Employee " + this.firstName + " " + this.lastName + " works: " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public int compute() {
    int result = 1;
    for (int i = 1; i < 20; i++) {
      result = result * i;
    }
    return result;
  }

}
