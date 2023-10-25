package com.example.lab_08_getmethodical;
import java.util.Scanner;

public class BirthDateTime {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            int birthYear = getRangedInt(console, "Enter the birth year (1950-2015): ", 1950, 2015);
            int birthMonth = getRangedInt(console, "Enter the birth month (1-12): ", 1, 12);

            int maxDays;
            switch (birthMonth) {
                case 2: // February
                    maxDays = (birthYear % 4 == 0 && (birthYear % 100 != 0 || birthYear % 400 == 0)) ? 29 : 28;
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    maxDays = 30;
                    break;
                default:
                    maxDays = 31;
            }

            int birthDay = getRangedInt(console, "Enter the birth day (1-" + maxDays + "): ", 1, maxDays);
            int birthHours = getRangedInt(console, "Enter the birth hour (1-24): ", 1, 24);
            int birthMinutes = getRangedInt(console, "Enter the birth minutes (1-59): ", 1, 59);

            System.out.println("Birth date and time: " + birthMonth + "/" + birthDay + "/" + birthYear + " " + birthHours + ":" + birthMinutes);
        }

        public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
            int userInput = 0;
            boolean validInput = false;

            do {
                System.out.print(prompt);

                if (pipe.hasNextInt()) {
                    userInput = pipe.nextInt();
                    if (userInput >= low && userInput <= high) {
                        validInput = true;
                    } else {
                        System.out.println("Input is out of the specified range [" + low + " - " + high + "]. Please try again.");
                    }
                } else {
                    String trash = pipe.next();
                    System.out.println("Invalid input. Please enter a valid integer within the range [" + low + " - " + high + "].");
                }

            } while (!validInput);

            pipe.nextLine();

            return userInput;
        }
    }
