package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double bascicPayment;
        if(hours <= 12.0) {
            bascicPayment = pricePerHour * Math.ceil(hours);
        } else {
            bascicPayment = pricePerDay * Math.ceil(hours / 24);
        }
        double tax = taxService.tax(bascicPayment);

        carRental.setInvoice(new Invoice(bascicPayment, tax));
    }
}
