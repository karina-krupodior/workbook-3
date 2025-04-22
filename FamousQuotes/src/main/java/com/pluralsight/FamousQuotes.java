package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//    Create a new Java application named FamousQuotes.
//    Create an array of strings to store 10 quotes. Add 10 of your favorite quotes to
//    the array.

        String[] quotes = {
                "If you believe it will work, you'll see opportunities. If you believe it won't, you will see obstacles.",
                "Believe you can and you're halfway there.",
                "Learn the rules like a pro, so you can break them like an artist.",
                "Do one thing every day that scares you.",
                "If you can dream it, you can do it.",
                "Even if you are on the right track, you'll get run over if you just sit there",
                "A year from now you may wish you had started today",
                "Don't count the days, make the days count.",
                "Build your own dreams, or someone else will hire you to build theirs.",
                "If you look at what you have in life, you’ll always have more. If you look at what you don’t have in life, you’ll never have enough."

        };
        try {
            System.out.print("Enter a number between 1 to 10 to see the quote: ");
            int chosenNumber = scanner.nextInt();
            System.out.println("Here is your quote: " + quotes[chosenNumber - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That number is out of range. Please enter a number between 1 and 10.");
        }

        scanner.close();

    }


}
