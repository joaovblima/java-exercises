import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
           vect[i] = sc.nextDouble();
           sum +=vect[i];
        }
        double avg = sum / n;

        System.out.printf("Media do vetor: %.3f%n", avg);
        System.out.println("Elementos abaixo da media: ");
        for(int i = 0; i< vect.length; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }


    }
}