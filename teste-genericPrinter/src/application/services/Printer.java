package application.services;

public class Printer <T> {
    T thingToPrinter;

    public Printer(T thingToPrinter) {
        this.thingToPrinter = thingToPrinter;
    }

    public void printer() {
        System.out.println(thingToPrinter);
    }

}
