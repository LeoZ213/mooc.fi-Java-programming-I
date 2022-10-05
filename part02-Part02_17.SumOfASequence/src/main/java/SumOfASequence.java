
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        System.out.println("Last number? ");
        int answer = Integer.valueOf(scanner.nextLine());
        for (int i = start; i < answer; i++) {
            sum += i;
        }
        sum = answer + sum;
        System.out.println(sum);

    }
}
