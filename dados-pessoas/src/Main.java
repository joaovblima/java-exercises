import entities.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa [] pessoas = new Pessoa[n];
        double mediaAltura;
        double somaAltura = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite a %da altura: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Digite o %do genero: ", i +1);
            char genero = sc.next().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getGender() == 'M') {
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
                somaAltura += pessoas[i].getAltura();
            }
        }
        mediaAltura = somaAltura / quantidadeMulheres;

        System.out.printf("Menor altura %.2f%n", menorAltura);
        System.out.printf("Maior altura %.2f%n", maiorAltura);
        System.out.printf("Media a ltura das mulheres: %.2f%n", mediaAltura);
        System.out.printf("Numero de homens = %d", quantidadeHomens);
    }
}