import app.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("What is dolar price? ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dolarQuantity = sc.nextDouble();

        System.out.printf("Amout to be paid in reais = %.2f", CurrencyConverter.yourDolar(dolar, dolarQuantity));

    }
}