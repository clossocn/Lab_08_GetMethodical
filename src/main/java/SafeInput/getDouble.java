package SafeInput;
import java.util.Scanner;
public class getDouble {

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
