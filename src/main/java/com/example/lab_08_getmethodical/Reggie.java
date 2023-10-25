package com.example.lab_08_getmethodical;
import java.util.Scanner;

public class Reggie {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String ssn = getRegExString(scanner, "Enter your Social Security Number (XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");
            String ucStudentMNumber = getRegExString(scanner, "Enter your UC Student M number (MXXXXX): ", "^(M|m)\\d{5}$");
            String menuChoice = getRegExString(scanner, "Select a menu choice (O, S, V, Q): ", "^[OoSsVvQq]$");

            System.out.println("SSN: " + ssn);
            System.out.println("UC Student M Number: " + ucStudentMNumber);
            System.out.println("Menu Choice: " + menuChoice);
        }

        public static String getRegExString(Scanner pipe, String prompt, String regEx) {
            String retString = "";
            boolean validInput = false;

            do {
                System.out.print(prompt);
                retString = pipe.nextLine();

                if (retString.matches(regEx)) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid string matching the pattern.");
                }
            } while (!validInput);

            return retString;
        }
    }
