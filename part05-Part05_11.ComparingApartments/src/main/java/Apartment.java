
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int ourPrice = this.squares * this.princePerSquare;
        int theirPrice = compared.squares * compared.princePerSquare;
        int priceDifference = Math.abs(ourPrice - theirPrice);
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ourPrice = this.rooms * this.squares;
        int comparedPrice = compared.rooms * compared.squares;
        if (ourPrice > comparedPrice) {
            return true;
        } else {
            return false;
        }

    }

}
