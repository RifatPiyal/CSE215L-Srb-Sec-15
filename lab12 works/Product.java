package lab12;

import java.util.*;

//product class
class Product{
    private String name;
    private double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    void changePrice(double percentage)
    {price=price*(1+percentage);
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

