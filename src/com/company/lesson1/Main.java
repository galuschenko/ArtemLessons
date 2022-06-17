package com.company.lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();

        Employee employee1 = new Employee(
            "Ivan", "Ivanov", 31, "IAUT", 10, POSITION.SENIOR);
        System.out.println("First name: " + employee1.firstName);
        System.out.println("Last name: " + employee1.lastName);
        System.out.println("Age: " + employee1.age);

        salaryPrinter.print(employee1);

        Employee employee2 = new Employee(
            "Petr", "Petrov", 20, "Ninja Turtles", 4000, POSITION.MIDDLE);
        salaryPrinter.print(employee2);

        Employee employee3 = new Employee(
            "Vasia", "Vasin", 5, "Ninja Turtles", POSITION.MIDDLE);
        salaryPrinter.print(employee3);

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Nikita", "Djigurda", 50, "Developer", POSITION.MIDDLE);
        employees[1] = new Employee("Sasha", "Petrov", 91, "AQA", 1200, POSITION.JUNIOR);

        for (Employee employee : employees) {
            if (employee != null) {
                namePrinter.print(employee);
                salaryPrinter.print(employee);
            }
            System.out.println("==================================");
        }

        List<Employee> employeeList = new ArrayList<>();
        addToList(employee1, employeeList);
        addToList(employee1, employeeList);
        addToList(employee2, employeeList);
        addToList(employee3, employeeList);
        addToList(employees[0], employeeList);
        addToList(employees[1], employeeList);
        addToList(new Employee("Roman", "Romanov", 12, "Loafers", POSITION.SENIOR), employeeList);
        addToList(new Employee("Vasia", "Romanov", 12, "Loafers", POSITION.JUNIOR), employeeList);
        for (Employee employee : employeeList) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }

        for (int i = 0; i < employeeList.size() - 1; i++) {
            if (employeeList.get(i).position.ordinal() > employeeList.get(i + 1).position.ordinal()) {
                Collections.swap(employeeList, i, i + 1);

            }
        }

        System.out.println("===========================");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

        Map<POSITION, Integer> counterPosition = new HashMap<>();
        Map<String, Integer> counterTeam = new HashMap<>();

        for (Employee employee : employeeList) {
            if (!counterPosition.containsKey(employee.position)) {
                counterPosition.put(employee.position, 1);
            } else {
                counterPosition.put(employee.position, counterPosition.get(employee.position) + 1);
            }
        }

        for (Employee employee : employeeList) {
            if (!counterTeam.containsKey(employee.team)) {
                counterTeam.put(employee.team, 1);
            } else {
                counterTeam.put(employee.team, counterTeam.get(employee.team) + 1);
            }
        }

        System.out.println("===================");
        System.out.println("Position counter: " + counterPosition);
        System.out.println("===================");
        System.out.println("Team counter: " + counterTeam);
        System.out.println("===================");

        for (Map.Entry<POSITION, Integer> entry : counterPosition.entrySet()) {
            System.out.println("Position: " + entry.getKey() + " counts: " + entry.getValue());
        }

        System.out.println("====================");
        for (Map.Entry<String, Integer> entry : counterTeam.entrySet()) {
            System.out.println("Position: " + entry.getKey() + " counts: " + entry.getValue());
        }
    }



    public static void addToList(Employee employee, List<Employee> employeeList) {
        if (!employeeList.contains(employee)) {
            employeeList.add(employee);
        } else {
            System.out.println("Dublicate employee : " + employee.firstName + " " + employee.lastName);
        }
    }
}
