
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(5);
        c.increase(-2);
        System.out.println(c.value());

    }
}
