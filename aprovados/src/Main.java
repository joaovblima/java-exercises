import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Aluno[] alunos = new Aluno[n];
        double media;

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite os dasdos da %da pessoa: %n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Primeira nota: ");
            double primeiraNota = sc.nextDouble();
            System.out.print("Segunda nota: ");
            double segundaNota = sc.nextDouble();
            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            media = (alunos[i].getPrimeiraNota() + alunos[i].getSegundaNota()) / 2;

            if (media >= 6.0) {
                System.out.printf("%s%n", alunos[i].getNome());
            }
        }


        sc.close();

    }
}