
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positives = 0;
        while (true) {
            int answer = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number");
            if (answer == 0 && positives == 0) {
                System.out.println("Cannot calculate average");
                break;
            }
            if (answer == 0 && positives > 0) {
                System.out.println(sum / (double) positives);
                break;
            }
            if (answer > 0) {
                sum = sum + answer;
                positives = positives + 1;
                continue;
            }
            if (answer < 0) {
                continue;
            }
        }

    }
}
