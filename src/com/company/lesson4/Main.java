package com.company.lesson4;

import com.company.lesson1.POSITION;

public class Main {

  public static void main(String[] args) throws Exception {
    var employee1 = new Employee("Employee", "1", 10, "Employees", POSITION.SENIOR);
    System.out.println(employee1.getFirstName() + " " + employee1.getLastName());

//    var employee2 = new Employee();
//    System.out.println(employee2.getFirstName());
//    System.out.println(employee2.getAge());
////    employee2.setFirstName("Employee");
////    employee2.setLastName("2");
//    System.out.println(employee2.getFirstName() + " " + employee2.getLastName());

    var employee2 = new Employee.Builder()
        .firstName("Employee")
        .lastName("2")
        .age(23)
        .salary(4444)
        .position(POSITION.SENIOR)
        .team("DEV").build();

    var singleton1 = Singleton.INSTANCE;
    var singleton2 = Singleton.INSTANCE;

    System.out.println(employee1 == employee2);
    System.out.println(singleton1 == singleton2);
  }
}
