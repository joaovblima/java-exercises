package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<TaxPayer> list = new ArrayList<>();

        for(int i=1; i <=n; i++) {
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (i/c)?");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (option == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpeditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpeditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

            double sum = 0.0;
            System.out.println();
            System.out.println("TAX PAID: ");
            for(TaxPayer payer : list) {
                double tax = payer.tax();
                System.out.println(payer.getName() + " $ " + String.format("%.2f", tax));
                sum += payer.tax();
            }
            System.out.println();
            System.out.printf("TOTAL TAXES: $%.2f%n", sum);

            sc.close();
        }
    }

