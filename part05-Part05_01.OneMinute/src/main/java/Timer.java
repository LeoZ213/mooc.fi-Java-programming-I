/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Timer {

    private int second;
    private int hsecond;

    public Timer() {
        second = 0;
        hsecond = 0;

    }

    public void advance() {
        if (hsecond == 100) {
            hsecond = 0;
            second = second + 1;
        }
        if (second == 60) {
            second = 0;
        }
        hsecond = hsecond + 1;
    }

    
    @Override
    public String toString() {
        if ((second < 10) && (hsecond < 10)) {
            return ("0" + second + ":" + "0" + hsecond);
        }
        if ((second < 10) && hsecond > 10) {
            return ("0" + second + ":" + hsecond);
        }
        if ((second > 10) && (hsecond < 10)) {
            return (second + ":" + "0" + hsecond);
        }
        return second + ":" + hsecond;
    }
}
