
public class Statistics {

    private int count;
    private int sum = 0;

    public Statistics() {
        // initialize the variable numberCount here

    }

    public void addNumber(int number) {
        // write code here
        this.count = this.count + 1;
        this.sum = this.sum + number;

    }

    public int getCount() {
        return this.count;
        // write code here
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.sum == 0) {
            return 0;
        } else {
            return this.sum / (double) this.count;
        }
    }
}
