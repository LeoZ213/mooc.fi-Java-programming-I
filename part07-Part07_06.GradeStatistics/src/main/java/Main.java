
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Points pointlist = new Points();
        UserInterface ui = new UserInterface(scanner, pointlist);
        ui.start();
    }
}
