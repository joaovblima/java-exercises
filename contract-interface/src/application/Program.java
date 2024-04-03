package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalServices());
        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }






        sc.close();
    }
}
