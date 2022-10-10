
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard Paul = new PaymentCard(20);
        PaymentCard Matt = new PaymentCard(30);

        Paul.eatHeartily();
        Matt.eatAffordably();

        System.out.println("Paul: " + Paul);
        System.out.println("Matt:" + Matt);

        Paul.addMoney(20);
        Matt.eatHeartily();

        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);
        
        Paul.eatAffordably();
        Paul.eatAffordably();
        
        Matt.addMoney(50);
        
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);

    }
}
