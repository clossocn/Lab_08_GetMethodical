package SafeInput;
import java.util.Scanner;
public class getYNConfirm {
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
