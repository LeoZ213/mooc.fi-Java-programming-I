/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.ArrayList;

public class Hold {

    private int maximum;
    private ArrayList<Suitcase> suitcase;

    private int weightOfHold = 0;

    public Hold(int max) {
        this.maximum = max;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.weightOfHold + suitcase.totalWeight()) > this.maximum) {

        } else {
            this.suitcase.add(suitcase);
            this.weightOfHold = this.weightOfHold + suitcase.totalWeight();
        }
    }
    public void printItems() {
        for (Suitcase i : this.suitcase) {
            i.printItems();
        }        
    }
    @Override
    public String toString() {
        return this.suitcase.size() +" suitcases (" + this.weightOfHold + " kg)";
    }
}
