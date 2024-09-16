import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Persona person;
    private List<Products> products;
    private double total;

    public Cart(Persona person) {
        this.person = person;
        this.products = new ArrayList<>();
        this.total = total;
    }

    public void addProduct(Products product) {
        products.add(product);
        total += product.getPrice();
        System.out.println(product.getName()+" add to the Shopping cart of:  "+person.getName());
    }

    public void removeProduct(Products product) {
        products.remove(product);
        total -= product.getPrice();
        System.out.println(product.getName()+" deleted from the cart "+person.getName());
    }
    public void showCart(){
        System.out.println("Shopping cart:  "+person.getName()+":");
        for(Products product: products){
            System.out.println(product.getName()+": "+product.getPrice());
        }
        System.out.println("Total: "+total);
    }

    public double getTotal() {
        return total;
    }
    public List<Products> getProducts() {
        return products;
    }

}
