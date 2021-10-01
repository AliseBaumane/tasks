package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Working hours of the day are:");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay > 0 && workingHoursInDay <= 8)
            System.out.println("Salary for work is:" + workingHoursInDay * 10 + "eur");
        if (workingHoursInDay > 8 && workingHoursInDay < 24)
            System.out.println("Salary for work is:" + (80 + (workingHoursInDay - 8) * 15) + "eur");
    }
}
