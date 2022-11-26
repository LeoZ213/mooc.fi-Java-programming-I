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
    private Points points;

    public UserInterface(Scanner scanner, Points point) {
        this.scanner = scanner;
        this.points = point;
    }

    public void start() {
        getStarted();
        System.out.println("Point average (all): " + this.points.averagePointAll());
        System.out.println("Point average (passing): " + this.points.averagePointPassing());
        System.out.println("Pass percentage: " + this.points.passingPercentage());
        System.out.println("Grade distribution: ");
        printGradeDistribution();
    }

    public void getStarted() {
        System.out.println("Enter total points, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input > 100 || input < 0) {
                continue;
            }
            points.add(input);
            points.addPointsAsGrades(input);
        }
    }
    public void printGradeDistribution() {
            
        int grade = 5;
        while (grade >= 0) {
            int stars = points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
