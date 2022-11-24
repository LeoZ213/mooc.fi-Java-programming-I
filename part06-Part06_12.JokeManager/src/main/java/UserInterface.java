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

    private final JokeManager jokeManager;
    private final Scanner scanner;

    public UserInterface(JokeManager jokeM, Scanner scanner) {
        this.jokeManager = jokeM;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String jokeToBeAdded = scanner.nextLine();
                this.jokeManager.addJoke(jokeToBeAdded);
                continue;
            }
            if (command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
                continue;
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }
}
