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

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int max) {
        this.maximumWeight = max;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int weightOfSuitcase = 0;
        for (Item i : this.items) {
            weightOfSuitcase = weightOfSuitcase + i.getWeight();
        }
        if ((weightOfSuitcase + item.getWeight()) > this.maximumWeight) {

        } else {
            this.items.add(item);
            weightOfSuitcase = weightOfSuitcase + item.getWeight();
        }
    }

    public void printItems() {
        String allItems = "";
        for (Item i : this.items) {
            allItems = allItems + i + "\n";
        }
        System.out.println(allItems);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : this.items) {
            totalWeight = totalWeight + i.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item i : this.items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }            
        }
        return heaviest;
    }

    @Override
    public String toString() {
        int amount = 0;
        int weight = 0;
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        for (Item i : this.items) {
            weight = weight + i.getWeight();
            amount++;
        }
        return amount + " items (" + weight + " kg)";
    }
}
