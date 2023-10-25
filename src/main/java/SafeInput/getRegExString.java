package SafeInput;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class getRegExString {

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
