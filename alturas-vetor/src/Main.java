import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("QUantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa [] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length; i++ ){
            System.out.printf("Dados da %da pessoa %n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            pessoa[i] = new Pessoa(name, age, height);
        }

        double avg;
        double sum = 0;

        for (int i = 0; i < pessoa.length; i++) {
            sum += pessoa[i].getHeight();
        }
        avg = sum / n;

        System.out.printf("Media : %.2f%n", avg);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i< pessoa.length; i++) {
            if (pessoa[i].getAge() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }


    }
}