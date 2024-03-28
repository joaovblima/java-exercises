import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("QUantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int maior = vect[0];
        int posmaior = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posmaior = i;
            }
        }
        System.out.printf("Maior valor: %d%n", maior);
        System.out.println("Posicao do maior valor: " + posmaior);
    }
}