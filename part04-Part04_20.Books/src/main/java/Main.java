
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> hello = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine the
        while (true) {
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int publication = Integer.valueOf(scanner.nextLine());
            hello.add(new Book(title, pages, publication));
        }
        
        String whatToPrint = scanner.nextLine();
        //determines what to print
        if (whatToPrint.equals("everything")) {
            for (Book hi : hello) {
                System.out.println(hi);
            }
        }
        //prints the toString method if typed "everything"
        if (whatToPrint.equals("name")) {
            for (Book z : hello) {
                System.out.println(z.title());
            }
        }
        //prints the titles only using the title() method

    }
}
