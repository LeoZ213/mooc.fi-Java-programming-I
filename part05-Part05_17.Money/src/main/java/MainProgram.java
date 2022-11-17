
public class MainProgram {

    public static void main(String[] args) {
        Money firstMoneyObject = new Money(1,0);
        Money secondMoneyObject = new Money(1,50);
        secondMoneyObject.lessThan(firstMoneyObject);
    }
}
