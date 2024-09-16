import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLibre");

        Persona customer = new Persona("John", "Smith", LocalDate.of(1994, 12, 16), "123456789", 1);

        List<Products> products = new ArrayList<>();

        products.add(new Products(100, 200.0, "CPU I5", "Processor", "Electronics"));
        products.add(new Products(101, 500.0, "CPU I7", "Processor", "Electronics"));
        products.add(new Products(102, 150.0, "Monitor", "LED", "Electronics"));
        products.add(new Products(103, 120.0, "Keyboard", "Mechanical", "Electronics"));
        products.add(new Products(104, 80.0, "Mouse", "Wireless", "Electronics"));


        products.add(new Products(200, 20.0, "1984", "Book", "Library"));
        products.add(new Products(201, 15.0, "Harry Potter", "Book", "Library"));
        products.add(new Products(202, 52.0, "Java 8", "Book", "Library"));
        products.add(new Products(203, 105.0, "Clean Code", "Book", "Library"));
        products.add(new Products(204, 90.0, "Effective Java", "Book", "Library"));


        products.add(new Products(300, 12.4, "T-shirt", "Clothing", "Others"));
        products.add(new Products(301, 25.0, "Mug", "Drinkware", "Others"));
        products.add(new Products(302, 30.0, "Notebook", "Stationery", "Others"));
        products.add(new Products(303, 18.0, "Pen", "Stationery", "Others"));
        products.add(new Products(304, 40.0, "Hat", "Clothing", "Others"));


        Cart electronicsCart = new Cart(customer);
        electronicsCart.addProduct(products.get(0)); // CPU I5
        electronicsCart.addProduct(products.get(1)); // CPU I7
        electronicsCart.addProduct(products.get(2)); // Monitor
        electronicsCart.addProduct(products.get(3)); // Keyboard

        Cart libraryCart = new Cart(customer);
        libraryCart.addProduct(products.get(6)); // Harry Potter
        libraryCart.addProduct(products.get(7)); // Java 8
        libraryCart.addProduct(products.get(8)); // Clean Code

        Cart othersCart = new Cart(customer);
        othersCart.addProduct(products.get(10)); // T-shirt


        System.out.println("\nLibrary type products with a price greater than 100:");
        products.stream()
                .filter(p -> p.getPrice() > 100 && p.getType().equals("Library"))
                .forEach(System.out::println);//.forEach(p -> System.out.println(p));


        double totalSum = products.stream().mapToDouble(Products::getPrice).sum();
        System.out.println("\nTotal sum of the price of all products $" + totalSum);


        double electronicsSum = products.stream()
                .filter(p -> p.getType().equals("Electronics"))
                .mapToDouble(Products::getPrice)
                .sum();
        System.out.println("\nTotal sum of the price of electronic products $" + electronicsSum);


        System.out.println("\nShopping cart sorted by price:");
        List<Products> sortedCart = electronicsCart.getProducts()
                .stream()
                .sorted(Comparator.comparingDouble(Products::getPrice))
                .toList();

        sortedCart.forEach(p -> System.out.println("Cart ID: 123123 | ID: " + p.getId() +
                " | PRODUCT TYPE: " + p.getType() + " | PRODUCT NAME: " + p.getName() +
                " | PRICE: $" + p.getPrice() + "| NAME OF BUYER: " + customer.getName()));
    }
}
