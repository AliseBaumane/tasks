package com.company;

public class Time {

    public static void main(String[] args) {
        //int time = 8;
        //int time =20;
        //int time = -2;
        int time = 100;

        if (time <= 12)
            System.out.println("Good Morning Sunshine!");
        if (13 <= time && time <= 19)
            System.out.println("Good Afternoon Work Hard");
        if (20 <= time && time <= 24)
            System.out.println("Good evening. Get some rest");
        if (time <= 0 || time > 24)
            System.out.println("Not correct time format");
    }
}