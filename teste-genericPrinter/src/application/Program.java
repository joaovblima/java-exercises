package application;

import application.services.Printer;

public class Program {
    public static void main(String[] args) {
        Printer <String> pt = new Printer<>("Ola joao");
        pt.printer();

        Printer <Integer> pt2 = new Printer<>(22);
        pt2.printer();



    }
}
