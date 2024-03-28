import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i  = 0; i <  n; i++) {
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee emp = employees.stream().filter(x-> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("That id does not exist.");
        } else {
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}