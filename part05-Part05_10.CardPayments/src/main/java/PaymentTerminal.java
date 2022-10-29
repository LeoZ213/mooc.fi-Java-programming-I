
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if ((payment - 2.50) < 0) {
            return payment;
        } else {
            this.money = this.money + (2.50);
            affordableMeals++;
            return (payment - 2.50);
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if ((payment - 4.30) < 0) {
            return payment;
        } else {
            this.money = this.money + (4.30);
            heartyMeals++;
            return (payment - 4.30);
        }
    }

    public boolean eatAffordably(PaymentCard Card) {
        if ((Card.balance() - 2.50) >= 0) {
            Card.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard Card) {
        if ((Card.balance() - 4.3) >= 0) {
            Card.takeMoney(4.3);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {

        } else {
            money = money + sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
