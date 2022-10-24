/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int values) {
        this.value = values;
    }

    public int value() {
        return this.value;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void increase(int number) {
        if (number < 0) {

        } else {
            this.value = this.value + number;
        }
    }

    public void decrease(int number) {
        if (number < 0) {

        } else {
            this.value = this.value - number;
        }
    }
}
