import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLibre");
        Scanner scanner=new Scanner(System.in);

        List<Persona> person= new ArrayList<>();
        person.add(new Persona("John", "Smith", LocalDate.of(1994, 12, 16), "123456789", 1));

        List<Products> products=new ArrayList<>();
        products.add(new Products(1, 200, "Laptop", "14", "Electronics"));
        products.add(new Products(2, 100, "New Moon", "Paper", "Library"));
        products.add(new Products(3, 500, "Kitchen", "Glass", "Others"));
        products.add(new Products(4, 90, "Plates", "Glass", "Others"));
        products.add(new Products(5, 10, "The little prince", "Paper", "Library"));
        products.add(new Products(6, 30, "Airpods", "White", "Electronics"));


        System.out.println("Please enter your customer number: ");
        for (Persona p : person) {
            System.out.println(p.getIdNumber() + ": " + p.getName() + " " + p.getLastName());
        }
        int idPersona = scanner.nextInt();
        Persona selectedPerson = person.get(0);

        Cart cart = new Cart(selectedPerson);

        boolean keepShopping = true;
        while (keepShopping) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a product");
            System.out.println("2. Remove a product");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.println("Available Products:");
                    for (Products product : products) {
                        System.out.println(product.getId() + ": " + product.getName() + " - $" + product.getPrice());
                    }

                    System.out.println("Enter the id of the product you want to add:");
                    int idProduct = scanner.nextInt();

                    Products selectedProduct = null;
                    for (Products product : products) {
                        if (product.getId() == idProduct) {
                            selectedProduct = product;
                            break;
                        }
                    }

                    if (selectedProduct != null) {
                        cart.addProduct(selectedProduct);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case 2:

                    System.out.println("Products in your cart:");
                    for (Products product : cart.getProducts()) {
                        System.out.println(product.getId() + ": " + product.getName() + " - $" + product.getPrice());
                    }

                    System.out.println("Enter the id of the product you want to remove:");
                    int idProductRemove = scanner.nextInt();

                    Products productToRemove = null;
                    for (Products product : cart.getProducts()) {
                        if (product.getId() == idProductRemove) {
                            productToRemove = product;
                            break;
                        }
                    }
                    if (productToRemove != null) {
                        cart.removeProduct(productToRemove);
                    } else {
                        System.out.println("Product not found in cart");
                    }
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    keepShopping = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        cart.showCart();
        System.out.println("Thank you for shopping!");
        scanner.close();
    }
}
