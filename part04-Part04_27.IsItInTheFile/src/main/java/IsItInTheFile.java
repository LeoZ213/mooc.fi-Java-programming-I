
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean inFile = false;
        
        try (Scanner x = new Scanner(Paths.get(file))) {
            while (x.hasNextLine()) {
                String line = x.nextLine();
                if (line.equals(searchedFor)) {
                    inFile = true;                    
                }
            }
            if (inFile == true) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
        }

    }

}
