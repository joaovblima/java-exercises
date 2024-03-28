import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        double sum = 0;
        int contPares = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] %2 ==0) {
                sum += vect[i];
                contPares +=1;
            }
        }

        if (contPares == 0) {
            System.out.println("NAO HA PARES");
        } else {
            double avg = sum / contPares;

            System.out.printf("Media dos pares: %.1f", avg);
        }






    }
}