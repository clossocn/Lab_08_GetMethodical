package com.example.lab_08_getmethodical;

public class PrettyHeader {
        public static void main(String[] args) {
            String message = "Message Centered Here";
            SafeInput.getHeader(message);
        }
    }

    class SafeInput {
        public static void getHeader(String msg) {
            int totalWidth = 60;
            int messageWidth = msg.length();

            int leftStars = (totalWidth - messageWidth - 6) / 2;
            int rightStars = totalWidth - messageWidth - 6 - leftStars;

            // Print the top row of stars
            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();

            // Print the second row with centered message
            System.out.print("***");
            for (int i = 0; i < leftStars; i++) {
                System.out.print(" ");
            }
            System.out.print(msg);
            for (int i = 0; i < rightStars; i++) {
                System.out.print(" ");
            }
            System.out.println("***");

            // Print the bottom row of stars
            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
