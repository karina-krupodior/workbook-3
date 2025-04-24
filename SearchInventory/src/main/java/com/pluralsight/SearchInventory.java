package com.pluralsight;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
//  ArrayList just like [] in JS

public class SearchInventory {

    // This method creates and returns a list of products
    public static ArrayList<Product> getInventory() {

//  Return type is ArrayList<Product> = a list where each item is a Product.

        // Create a new empty list to store products
        ArrayList<Product> listOfProducts = new ArrayList<>();
        // ArrayList<>() — создаём новый пустой список.
//        let listOfProducts = [] in JS.

        // Add 5 sample products to the list
        listOfProducts.add(new Product(1, "bread", 4));
        // Консоль: ID: 1, Name: bread, Price: $4.0
        listOfProducts.add(new Product(2, "milk", 2.50f));
        listOfProducts.add(new Product(3, "meat", 25.99f));
        listOfProducts.add(new Product(4, "apple", 5.00f));
        listOfProducts.add(new Product(5, "potato", 9.99f));

//        We’re adding a new product (object with id, name, price) to the list.
//                JS analogy: listOfProducts.push({ id: 1, name: "bread", price: 4 })

        // Return the filled list
        return listOfProducts;
    }

    // This is the main method - the program starts here
    public static void main(String[] args) {
        // Get the list of products from getInventory method
        ArrayList<Product> listOfProducts = getInventory();
//        Это уже вызов метода getInventory() — и сохранение его результата в переменную listOfProducts.
//        let listOfProducts = getInventory(); // получаем список и сохраняем его в переменную

        // Print a message
        System.out.println("Store Inventory:");

        // Loop through the list and print each product
        for (Product eachProduct : listOfProducts) {
            System.out.println(eachProduct);  // this automatically calls product.toString()
        }
    }
}


