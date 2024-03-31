package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdraw = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdraw);
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amountWithdraw = sc.nextDouble();

        try {
            account.withdraw(amountWithdraw);
            System.out.printf("New balance: %.2f", account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
