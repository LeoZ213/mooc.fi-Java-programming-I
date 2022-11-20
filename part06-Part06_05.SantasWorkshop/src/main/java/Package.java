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

public class Package {

    private ArrayList<Gift> gift;

    public Package() {
        this.gift = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gift.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift i : gift) {
            weight = weight + i.getWeight();
        }
        return weight;
    }
}
