import java.util.ArrayList;
import java.util.List;

public class Products {

    private int id;
    private double price;
    private String name;
    private String description;
    private String type;

    public Products(int id, double price, String name, String description, String type) {
        this.id=id;
        this.price=price;
        this.name=name;
        this.description=description;
        this.type=type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString method
    @Override
    public String toString() {
        return "ID: " + id +"Product: " + name + ", Price: " + price + ", Description: " + description + ", Type: " + type;
    }

}
