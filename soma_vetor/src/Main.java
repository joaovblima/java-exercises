import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.printf("Soma: %.2f%n", sum);

        double avg = sum / n;

        System.out.printf("MEDIA = %.2f", avg);
    }
}