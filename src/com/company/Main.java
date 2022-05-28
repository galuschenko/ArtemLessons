package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sasha", "Halushchenko", 31, "IAUT", 10);
        System.out.println("First name: " + employee1.firstName);
        System.out.println("Last name: " + employee1.lastName);
        System.out.println("Age: " + employee1.age);

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        salaryPrinter.print(employee1);

        Employee employee2 = new Employee("Petr", "Petrov", -20, "Ninja Turtles", -4000);
        salaryPrinter.print(employee2);
    }
}
