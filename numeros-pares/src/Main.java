import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("QUantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i]= sc.nextInt();
        }
        System.out.println("Numeros pares: ");
        int countPares = 0;
        for (int i = 0; i< vect.length; i++) {
            if (vect[i] %2 == 0) {4
                System.out.printf("%d %n", vect[i]);
                countPares +=1;
            }
        }
        System.out.println("Quantidade de pares: " + countPares);

    }
}