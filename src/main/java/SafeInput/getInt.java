package SafeInput;
import java.util.Scanner;
public class getInt {
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
}
