
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int i = 0;
        int x = 0;
        i = this.euros + addition.euros;
        x = this.cents + addition.cents;
        Money newMoney = new Money(i, x);

        return newMoney;
    }
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        if (this.euros == compared.euros && (this.cents > compared.cents)) {
            return false;
        }
        if (compared.euros > this.euros) {
            return true;
        }
        if (compared.euros == this.euros && (compared.cents > this.cents)) {
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser) {
        int x = this.euros;
        int y = this.cents;
        
        if (y - decreaser.cents < 0) {
            x = x-1;
            y = y + 100;
        }
        y = y - decreaser.cents;
        x = x - decreaser.euros;
        Money newMoney = new Money(x,y);
        if (x < 0) {
           Money negative = new Money(0,0);
           return negative;
        }
        return newMoney;
    }
}

