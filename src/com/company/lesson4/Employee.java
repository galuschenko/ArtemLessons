package com.company.lesson4;

import com.company.lesson1.POSITION;

public class Employee {

  private String firstName;
  private String lastName;
  private int age;
  private String team;
  private long salary;
  private POSITION position;

  public Employee(String firstName, String lastName, int age, String team, POSITION position)
      throws Exception {
    this(firstName, lastName, age, team, 0, position);
  }

  public Employee() {
  }

//  public void setFirstName(String firstName1) {
//    firstName = firstName1;
//  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

//  public void setLastName(String lastName) {
//    this.lastName = lastName;
//  }

  public int getAge() {
    return age;
  }

//  public void setAge(int age) {
//    this.age = age;
//  }

  public String getTeam() {
    return team;
  }

//  public void setTeam(String team) {
//    this.team = team;
//  }

  public long getSalary() {
    return salary;
  }

//  public void setSalary(long salary) {
//    this.salary = salary;
//  }

  public POSITION getPosition() {
    return position;
  }

//  public void setPosition(POSITION position) {
//    this.position = position;
//  }


  public Employee(String firstName, String lastName, int age, String team, long salary,
      POSITION position) throws Exception {
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

  public static class Builder {

    private String firstName;
    private String lastName;
    private int age;
    private String team;
    private long salary;
    private POSITION position;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder team(String team) {
      this.team = team;
      return this;
    }

    public Builder salary(int salary) {
      this.salary = salary;
      return this;
    }

    public Builder position(POSITION position) {
      this.position = position;
      return this;
    }

    public Employee build() throws Exception {
      return new Employee(firstName, lastName, age, team, salary, position);
    }
  }
}