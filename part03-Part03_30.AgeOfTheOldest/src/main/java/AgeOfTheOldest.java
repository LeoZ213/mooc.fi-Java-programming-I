
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int biggest = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");

            if (Integer.valueOf(parts[1]) > biggest) {
                biggest = Integer.valueOf(parts[1]);
            } else {
                continue;
            }
        }
        System.out.println("Age of the oldest: " + biggest);

    }
}
