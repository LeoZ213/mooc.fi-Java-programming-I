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

public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grade;

    public Points() {
        this.points = new ArrayList<>();
        this.grade = new ArrayList<>();
    }

    public double passingPercentage() {
        int totalCount = 0;
        int passingCount = 0;
        for (int i : this.points) {
            if (i >= 50) {
                passingCount++;
            }
            totalCount++;
        }
        return (100 * (passingCount / (double) totalCount));
    }

    public void add(int number) {
        this.points.add(number);
    }

    public double averagePointAll() {
        int sum = 0;
        int count = 0;
        for (int i : this.points) {
            sum = sum + i;
            count++;
        }
        return (sum / (double) count);
    }

    public void addPointsAsGrades(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        this.grade.add(grade);
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int i : this.grade) {
            if (i == grade) {
                count++;
            }
        }
        return count;
    }

    public String averagePointPassing() {
        int passingSum = 0;
        int passingCount = 0;
        for (int i : this.points) {
            if (i < 50) {
                continue;
            } else {
                passingSum = passingSum + i;
                passingCount++;
            }
        }
        if (passingCount == 0) {
            return "-";
        } else {
            return String.valueOf(passingSum / (double) passingCount);
        }

    }

}
