package com.pluralsight;


// This class represents a product in the store
public class Product {
    private int id;         // product ID
    private String name;    // product name
    private float price;    // product price

    // Constructor to create a new product with ID, name, and price
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter methods (used to access private variables)
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    // This makes it easier to print product details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}
