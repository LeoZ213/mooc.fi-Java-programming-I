
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        double average = (number1 + (double) number2) / 2;
        System.out.println("The average is " + average);

    }
}
