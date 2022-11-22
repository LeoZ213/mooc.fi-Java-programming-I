/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return (this.name + " (" + this.weight + " kg)");
    }
}
