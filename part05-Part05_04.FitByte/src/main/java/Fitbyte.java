/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Fitbyte {
    private int ages;
    private int restinghr;
    
    public Fitbyte(int age, int restingHeartRate) {
        ages = age;
        restinghr = restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.ages);
        return (maximumHeartRate - this.restinghr) * (percentageOfMaximum) + this.restinghr;
    }
}
