
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (number > i) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int a = 0;
        while (number > a) {
            System.out.print(" ");
            a++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (size >= i) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int ha = 1;
        int lol = 1;
        for (int i = height; i < (2 * height); i++) {
            printSpaces(height - lol);
            printStars(ha);
            ha = ha + 2;
            lol = lol + 1;
        }
        for (int z = 0; z <2;z++) {
            printSpaces(height-2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
