/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Song {
    private int length;
    private String name;
    
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public String name(){
        return name;
    }
    public int length() {
        return length;
    }
}
