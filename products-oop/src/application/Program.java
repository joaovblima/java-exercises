package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
public class Program {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> listProducts = new ArrayList<>();

        for(int i = 1; i <=n; i++) {
            System.out.println("Product #"+ i + "data:");
            System.out.print("Common, used or imported: (c/u/i)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(option == 'c'){
                listProducts.add(new Product(name, price));
            }
            else if(option == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                listProducts.add(new ImportedProduct(name, price, fee));
            } else {
                System.out.print("Manufacture data: (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listProducts.add(new UsedProduct(name, price, date));
            }

        }


        sc.close();
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : listProducts) {
            System.out.println(product.priceTag());
        }
        }
    }
