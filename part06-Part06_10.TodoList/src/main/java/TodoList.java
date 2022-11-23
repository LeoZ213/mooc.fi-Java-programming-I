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

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }

    public void print() {
        int count = 1;
        for (String i : this.list) {
            System.out.println(count + ": " + i);
            count++;
        }
    }
}
