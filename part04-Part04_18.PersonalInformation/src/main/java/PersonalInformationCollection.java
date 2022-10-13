
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {            
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }           
            String last = scanner.nextLine();            
            String indentify = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, last, indentify));

        }
        for (PersonalInformation people : infoCollection) {
            System.out.println(people.getFirstName() + " " + people.getLastName());   
        }

    }
}
