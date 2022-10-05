
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        int i = 1;
        System.out.println("Give a number: ");
        int answer = Integer.valueOf(scanner.nextLine());
        while (true) {
            if (answer == 0) {
                System.out.println("Factorial: 1");
                break;
            }
            if (i >= answer) {
                System.out.println("Factorial: " + product);
                break;
            }
            for (i = i; i <= answer; i++) {
                product = product * i;
                continue;
            }

        }

    }
}
