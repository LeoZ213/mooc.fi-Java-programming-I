
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == -1) {
                break;
            }
            numbers = numbers + 1;
            sum = sum + answer;
            if ((answer % 2 == 0)) {
                even = even + 1;
                continue;
            }
            if ((answer % 2 != 0)) {
                odd = odd + 1;
                continue;
            }

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (sum / (double) numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);

    }
}
