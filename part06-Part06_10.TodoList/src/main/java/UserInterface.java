/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                this.list.add(toAdd);
                continue;
            }
            if (command.equals("list")) {
                this.list.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removedValue = Integer.valueOf(scanner.nextLine());
                this.list.remove(removedValue);
            }
        }

    }
}
