
import java.util.Scanner;

public class DivisibleByThree {

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i ++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(start, end);

    }

}
