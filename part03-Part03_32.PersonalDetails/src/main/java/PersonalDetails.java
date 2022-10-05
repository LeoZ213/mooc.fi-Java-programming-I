
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestname = "i";
        int sum = 0;
        int amount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            amount = amount + 1;
            
            if (String.valueOf(parts[0]).length() > longestname.length()) {
                longestname = String.valueOf(parts[0]);
            }
        }
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth years: " + (sum / (double) amount));

    }
}
