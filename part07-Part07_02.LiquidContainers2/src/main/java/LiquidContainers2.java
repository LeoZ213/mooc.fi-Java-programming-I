
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                container1.add(value);
            }
            if (command.equals("move")) {
                if(value < 0) {
                    continue;
                }
                if(value > container1.contains()) {
                    container2.add(container1.contains());
                    container1.remove(101);
                    continue;
                }
                if (value >= 100 || (value + container2.contains()) > 100) {
                    container1.remove(101);
                    container2.add(101);
                    continue;
                }
                container1.remove(value);
                container2.add(value);               
            }
            if (command.equals("remove")) {
                container2.remove(value);
            }
        }
    }

}
