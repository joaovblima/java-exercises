import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Name: ");
        aluno.name = sc.nextLine();
        aluno.primeiraNota = sc.nextDouble();
        aluno.segundaNota = sc.nextDouble();
        aluno.terceiraNota = sc.nextDouble();

        double nota = aluno.notaFinal();

        System.out.println("Final grade: " + nota);

        if (nota >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.0 - nota) + " POINTS");
        }

    }
}