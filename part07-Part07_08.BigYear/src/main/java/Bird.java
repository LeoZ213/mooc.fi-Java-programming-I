/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;
    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.latin = nameInLatin;
        this.observations = 0;
    }
    public String getName() {
        return this.name;
    }
    public String getNameInLatin() {
        return this.latin;
    }
    public void addObservation() {
        this.observations++;
    }
    @Override
    public String toString() {
        return (getName() + "(" + getNameInLatin() + "): " + this.observations + " observations");
    }
}


