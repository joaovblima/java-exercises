import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas vai digitar? ");
        int n = sc.nextInt();
        Pessoa [] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite os dados da %da pessoa %n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa(name, idade);
        }

        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maiorIdade) {
                maiorIdade = pessoas[i].getIdade();
                nomeMaiorIdade = pessoas[i].getNome();
            }
        }

        System.out.printf("Pessoa vais velha: %s, com %d anos", nomeMaiorIdade, maiorIdade);
    }

}