
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Number of numbers: " + total);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            if (number > 0) {
                total = total + 1;
                sum = number + sum;
                continue;
            }
            if (number < 0) {
                total = total + 1;
                sum = number + sum;
                continue;
            }
            
        }

    }
}
