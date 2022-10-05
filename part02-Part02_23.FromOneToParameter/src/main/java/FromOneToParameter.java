

public class FromOneToParameter {

    public static void main(String[] args) {
        System.out.println(" ");
        printUntilNumber(5);

    }
    public static void printUntilNumber(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.println(i);
        }
    }

}
