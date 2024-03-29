package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double addCharge = sc.nextDouble();
                listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));


            } else {
                listEmployee.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee employee : listEmployee) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }
        sc.close();
    }
}
