
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;
        String name = "nothing";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1]) > biggest) {
                biggest = Integer.valueOf(parts[1]);
                name = String.valueOf(parts[0]);
            } else {
                continue;
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
