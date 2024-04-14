package application;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 10);

        Stream<Integer> st1 = numbers.stream().map(x-> x * 10);
        //numbers.forEach(System.out::println);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Joao", "Maria", "Ingrid", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));
GIT I
        Stream<Integer> st3 = Stream.iterate(1, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        int sum = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("sum " + sum);


        }
}

