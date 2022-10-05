
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            for (String i : pieces) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }


    }
}
