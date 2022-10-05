
public class FromParameterToOne {

    public static void printFromNumberToOne(int number) {
        for (int x = 1; number >= x; number--) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        printFromNumberToOne(5);

    }

}
