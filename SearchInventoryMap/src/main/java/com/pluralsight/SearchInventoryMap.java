package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchInventoryMap {

    // Inventory stored as: product name → Product object
    private static final Map<String, Product> inventoryMap = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();  // Load products from CSV

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a product name to search: ");
            String productName = scanner.nextLine().trim();

            Product foundProduct = inventoryMap.get(productName);

            if (foundProduct != null) {
                System.out.printf("Product found: %s (ID: %d) - $%.2f%n",
                        foundProduct.getProductName(),
                        foundProduct.getProductId(),
                        foundProduct.getProductPrice());
            } else {
                System.out.println("Sorry, that product was not found.");
            }
        }
    }

    private static void loadInventory() {
        String filePath = "src/main/resources/Inventory.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                int id = Integer.parseInt(fields[0].trim());
                String name = fields[1].trim();
                float price = Float.parseFloat(fields[2].trim());

                Product product = new Product(id, name, price);
                inventoryMap.put(name, product);  // Add product to map
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading inventory: " + e.getMessage());
        }
    }
}
