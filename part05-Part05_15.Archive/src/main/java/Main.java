 
 
import java.util.ArrayList;
import java.util.Scanner;
 
 
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identifier = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> alreadyPrinted = new ArrayList<>();
 
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identify = scanner.nextLine();
            if (identify.isEmpty()) {
                break;
            }
            identifier.add(identify);
            System.out.println("Name? (empty will stop)");
            String namex = scanner.nextLine();
            if (namex.isEmpty()) {
                break;
            }
            name.add(namex);
        }
 
        System.out.println("==Items==");
 
        for (int i = 0; i < identifier.size() && i < name.size(); i++) {
            if (alreadyPrinted.contains(identifier.get(i))) {
 
            } else {
                System.out.println(identifier.get(i) + ": " + name.get(i));
                alreadyPrinted.add(identifier.get(i));
            }
        }
    }
 
