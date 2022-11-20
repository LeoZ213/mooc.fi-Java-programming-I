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

public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        if (this.person.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person shortest = this.person.get(0);

        for (Person i : this.person) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            } else {

            }
        }
        return shortest;
    }

    public Person take() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person shortest = this.person.get(0);

        for (Person i : this.person) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            } else {

            }
        }
        this.person.remove(shortest);
        return shortest;
    }
}
