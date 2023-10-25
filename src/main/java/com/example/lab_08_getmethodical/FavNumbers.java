package com.example.lab_08_getmethodical;
import java.util.Scanner;

public class FavNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int favoriteInt = getInt(scanner, "Enter your favorite integer: ");
            double favoriteDouble = getDouble(scanner, "Enter your favorite double: ");

            System.out.println("Your favorite integer is: " + favoriteInt);
            System.out.println("Your favorite double is: " + favoriteDouble);
        }

        public static int getInt(Scanner pipe, String prompt) {
            int userInput = 0;
            boolean validInput = false;

            do {
                System.out.print(prompt);

                if (pipe.hasNextInt()) {
                    userInput = pipe.nextInt();
                    validInput = true;
                } else {
                    String trash = pipe.next();
                    System.out.println("Invalid input. Please enter a valid integer.");
                }

            } while (!validInput);

            pipe.nextLine();

            return userInput;
        }

        public static double getDouble(Scanner pipe, String prompt) {
            double userInput = 0.0;
            boolean validInput = false;

            do {
                System.out.print(prompt);

                if (pipe.hasNextDouble()) {
                    userInput = pipe.nextDouble();
                    validInput = true;
                } else {
                    String trash = pipe.next();
                    System.out.println("Invalid input. Please enter a valid double.");
                }

            } while (!validInput);

            pipe.nextLine();

            return userInput;
        }
    }