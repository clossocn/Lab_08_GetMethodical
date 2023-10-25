package SafeInput;
import java.util.Scanner;
public class getRangedDouble {
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
}
