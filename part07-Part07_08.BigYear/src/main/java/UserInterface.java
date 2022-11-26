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
    private BirdsList list;
    
    public UserInterface(Scanner scanner, BirdsList birdlist) {
        this.scanner = scanner;
        this.list = birdlist;
    }
    public void start() {
        startProcess();
    }
    public void startProcess() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if(command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                this.list.add(name, latinName);
                continue;
            }
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();               
                this.list.addObservation(bird);
                continue;
            }
            if (command.equals("All")) {
                this.list.list();
                continue;
            }
            if (command.equals("One")) {
                System.out.println("Bird?");
                String oneBirdName = scanner.nextLine();
                this.list.one(oneBirdName);
            }
        }
    }
    
}
