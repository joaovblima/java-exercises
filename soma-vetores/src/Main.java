import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("QUantos valores vai ter cada vetor: ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] soma = new int[n];

        System.out.println("DIgite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i< vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i< vectA.length;i++) {
            soma[i] = vectA[i] + vectB[i];
        }

        for (int i = 0; i< soma.length; i++) {
            System.out.println(soma[i]);
        }

    }
}