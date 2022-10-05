
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
                


        // Write your program here
    }
}

// Part 1
//        System.out.println("Where to? ");
//        int answer = Integer.valueOf(scanner.nextLine());
//        int start = 1;
//      for (int i = start; i <= answer; i++) {
//            System.out.println(i);
//        }

