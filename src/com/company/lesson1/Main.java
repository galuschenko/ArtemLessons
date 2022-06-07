package com.company.lesson1;

public class Main {

    public static void main(String[] args) throws Exception {

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();

        Employee employee1 = new Employee(
            "Ivan", "Ivanov", 31, "IAUT", 10, POSITION.JUNIOR);
        System.out.println("First name: " + employee1.firstName);
        System.out.println("Last name: " + employee1.lastName);
        System.out.println("Age: " + employee1.age);

        salaryPrinter.print(employee1);

        Employee employee2 = new Employee(
            "Petr", "Petrov", 20, "Ninja Turtles", 4000, POSITION.MIDDLE);
        salaryPrinter.print(employee2);

        Employee employee3 = new Employee(
            "Vasia", "Vasin", 5, "AQA", POSITION.MIDDLE);
        salaryPrinter.print(employee3);

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Nikita", "Djigurda", 50, "Developer", POSITION.MIDDLE);
        employees[1] = new Employee("Sasha", "Petrov", 91, "AQA", 1200, POSITION.JUNIOR);

        for (Employee employee : employees) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }


    }
}
