package application;


import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental car = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com preco por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com preco por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(car);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", car.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", car.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", car.getInvoice().totalPayment()));


        sc.close();
    }
}
