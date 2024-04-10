import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Program {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();
        

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            int number = sc.nextInt();
            courseA.add(number);
        }

        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        for(int i = 0; i < b; i++) {
            int number = sc.nextInt();
            courseB.add(number);
        }

        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        for(int i = 0; i < c; i++) {
            int number = sc.nextInt();
            courseC.add(number);
        }

        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}