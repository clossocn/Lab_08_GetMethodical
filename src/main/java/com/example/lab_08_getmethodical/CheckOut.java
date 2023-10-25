package com.example.lab_08_getmethodical;
import java.util.Scanner;

public class CheckOut {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double totalCost = 0.0;

            do {
                double itemPrice = getRangedDouble(scanner, "Enter the price of your item (0.50 - 10.00): ", 0.50, 10.00);
                totalCost += itemPrice;

                boolean moreItems = getYNConfirm(scanner, "Do you have more items to purchase? (Y/N): ");
                if (!moreItems) {
                    break;
                }
            } while (true);

            System.out.printf("Total cost of items: $%.2f%n", totalCost);
        }

        public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
            double userInput = 0.0;
            boolean validInput = false;

            do {
                System.out.print(prompt);

                if (pipe.hasNextDouble()) {
                    userInput = pipe.nextDouble();
                    if (userInput >= low && userInput <= high) {
                        validInput = true;
                    } else {
                        System.out.println("Input is out of the specified range [" + low + " - " + high + "]. Please try again.");
                    }
                } else {
                    String trash = pipe.next();
                    System.out.println("Invalid input. Please enter a valid double within the range [" + low + " - " + high + "].");
                }

            } while (!validInput);

            pipe.nextLine();

            return userInput;
        }

        public static boolean getYNConfirm(Scanner pipe, String prompt) {
            boolean validInput = false;
            boolean response = false;

            do {
                System.out.print(prompt);
                String input = pipe.next();

                if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
                    validInput = true;
                    response = input.equalsIgnoreCase("Y");
                } else {
                    System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
                }

            } while (!validInput);

            return response;
        }
    }
