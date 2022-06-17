package com.company.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Runner {

  public static void main(String[] args) throws Exception {

    Employee employee1 = new Employee(
        "Ivan", "Ivanov", 31, "IAUT", 10, POSITION.SENIOR);
    Employee employee2 = new Employee(
        "Petr", "Petrov", 20, "Ninja Turtles", 4000, POSITION.MIDDLE);
    Employee employee3 = new Employee(
        "Vasia", "Vasin", 5, "Ninja Turtles", POSITION.MIDDLE);
    Employee[] employees = new Employee[2];
    employees[0] = new Employee("Nikita", "Djigurda", 50, "Developer", POSITION.MIDDLE);
    employees[1] = new Employee("Sasha", "Petrov", 91, "AQA", 1200, POSITION.JUNIOR);
    List<Employee> employeeList = new ArrayList<>();
    addToList(employee1, employeeList);
    addToList(employee2, employeeList);
    addToList(employee2, employeeList);
    addToList(employee3, employeeList);
    addToList(employees[0], employeeList);
    addToList(employees[1], employeeList);
    addToList(new Employee("Roman", "Romanov", 12, "Loafers", POSITION.SENIOR), employeeList);
    addToList(new Employee("Vasia", "Romanov", 12, "Loafers", POSITION.JUNIOR), employeeList);

//    List<EmployeeThread> threads = new ArrayList<>();
//    for(Employee employee : employeeList) {
//      threads.add(new EmployeeThread(employee));
//    }

//    for (EmployeeThread thread : threads) {
//      thread.start();
//      if (thread.getEmployee().firstName.equals("Ivan")) {
//        thread.join();
//      }
//    }

//    List<EmployeeCallable> callables = new ArrayList<>();
//    for(Employee employee : employeeList) {
//      callables.add(new EmployeeCallable(employee));
//    }
//
//    List<FutureTask<Integer>> futureTasks = new ArrayList<>();
//    for (EmployeeCallable callable : callables) {
//      FutureTask<Integer> futureTask = new FutureTask<>(callable);
//      futureTasks.add(futureTask);
//      Thread thread = new Thread(futureTask);
//      thread.start();
//    }

//    for (FutureTask<Integer> futureTask : futureTasks) {
//      System.out.println(futureTask.get());
//    }

//    ExecutorService service = Executors.newFixedThreadPool(5);
//    for (Employee employee : employeeList) {
//      service.execute(employee::work);
//    }
//    service.shutdown();

  ExecutorService callableService = Executors.newFixedThreadPool(2); //создаем пулл тредов
  List<Future<Integer>> futureList = new ArrayList<>(); // лист для будущих результатов
  for (Employee employee : employeeList) {
    Future<Integer> future = callableService.submit(employee::compute); // отдаем сервису наших сотрудников, которые
    futureList.add(future); // вносим в лист будущие результаты
  }

  for (Future<Integer> future : futureList) {
    System.out.println(future.get());
  }

  callableService.shutdown();

  }

  public static void addToList(Employee employee, List<Employee> employeeList) {
    if (!employeeList.contains(employee)) {
      employeeList.add(employee);
    } else {
      System.out.println("Dublicate employee : " + employee.firstName + " " + employee.lastName);
    }
  }

}
