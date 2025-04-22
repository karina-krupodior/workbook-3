package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner inputScanner = new Scanner(System.in);

        // Inform the user about available stories
        System.out.println("Available stories:");
        System.out.println("goldilocks.txt");
        System.out.println("hansel_and_gretel.txt");
        System.out.println("mary_had_a_little_lamb.txt");

        // Ask the user for the story file name
        System.out.print("\nEnter the file name of the story you want to read: ");
        String fileName = inputScanner.nextLine();

        // Define the relative path to the file in DataFiles folder
        File storyFile = new File("/Users/karina/pluralsight/workbook-3/BedtimeStories/src/main/resources/DataFiles/" + fileName);
        // Adjust relative path based on your structure

        // Try to open and read the file
        try (Scanner fileScanner = new Scanner(storyFile)) {
            // Variable to keep track of line numbers
            int lineNumber = 1;

            // Read the file line by line
            while (fileScanner.hasNextLine()) {
                // Read one line from the file
                String line = fileScanner.nextLine();

                // Print the line with its line number
                System.out.println(lineNumber + ": " + line);

                // Increment the line number for the next iteration
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            // If the file is not found, print an error message
            System.out.println("❗File not found: " + fileName);
        }

        // Close the scanner for user input
        inputScanner.close();
    }
}
