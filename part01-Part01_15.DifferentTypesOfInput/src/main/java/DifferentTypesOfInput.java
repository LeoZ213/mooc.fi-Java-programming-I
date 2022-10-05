
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String message = scanner.nextLine();
        System.out.println("Give an integer: ");
        Integer numbz = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        Double numbd = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        Boolean selection = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + numbz);
        System.out.println("You gave the double " + numbd);
        System.out.println("You gave the boolean " + selection);
        
        
        
        

        // Write your program here
        

        
        
                

    }
}
