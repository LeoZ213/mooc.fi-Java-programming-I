
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment a1 = new Apartment(1, 20, 1000);
        Apartment a2 = new Apartment(2, 30, 2000);
        Apartment a3 = new Apartment(2, 23, 1500);

        int difference = a1.priceDifference(a2);
        System.out.println(difference
        );
    }
}
