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

public class BirdsList {

    ArrayList<Bird> birds;

    public BirdsList() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latin) {
        this.birds.add(new Bird(name, latin));
    }
    public void addObservation(String name) {
        for (Bird i : this.birds) {
            if (i.getName().equals(name)) {
                i.addObservation();
                return;
            } 
        }
        System.out.println("Not a bird!");
    }

    public void list() {
        for (Bird i : this.birds){
            System.out.println(i);
        }
    }
    public void one(String name) {
        for (Bird i : this.birds) {
            if (i.getName().equals(name)) {
                System.out.println(i);
                return;
            }
        }
    }
}
