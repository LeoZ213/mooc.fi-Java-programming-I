/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Whistle {
    private String sound;
    
    public Whistle(String customsound) {
        this.sound = customsound;
    }
    public void sound() {
        System.out.println(this.sound);
    }
}
