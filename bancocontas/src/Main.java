import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account hold: ");
        String name = sc.nextLine();
        System.out.print("Is the an initial deposit? (y/n)");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            account = new Account(accountNumber, name, depositValue);
        } else {
            account = new Account(accountNumber, name);
        }


        System.out.println("Account data: ");
        System.out.println(account.toString());

        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        account.depositAccount(depositValue);
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        double value = sc.nextDouble();
        account.withdrawAccount(value);
        System.out.println(account.toString());

        sc.close();
    }
}