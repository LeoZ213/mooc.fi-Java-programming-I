
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int durations = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, durations));
        }
        System.out.println("Program's Maximum duration");
        int maximum = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram hello : programs) {
            if (hello.getDuration() <= maximum) {
                System.out.println(hello);
            }
        }

    }
}
