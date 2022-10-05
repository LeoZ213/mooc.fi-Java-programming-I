
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 100;
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

    }
}
