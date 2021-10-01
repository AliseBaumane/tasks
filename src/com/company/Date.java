package com.company;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please write the day");
        int day = input.nextInt();
        System.out.println("Please write the month");
        int month = input.nextInt();
        System.out.println("Please write the year");
        int year = input.nextInt();
        System.out.println("Please select the date formatting : 1 - YYYY/MM/DD, 2 - YYYY.MM.DD");
        int formatting = input.nextInt();
        if (formatting == 1)
            System.out.println("Your date is " + year + "/" + month + "/" + day);
        else
            System.out.println("Your date is " + year + "." + month + "." + day);


    }
}