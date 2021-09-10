package com.company;

public class Main {

    public static void main(String[] args) {
	short numberOne = 4;
	short numberTwo = 10;
	if (numberOne>numberTwo)
    {
        System.out.println(numberOne + " is bigger");
    }
	else
    {
        System.out.println(numberTwo + " is bigger" );
    }
	if (numberOne<numberTwo)
        System.out.println(numberOne + " is smaller");
	else
        System.out.println(numberTwo + "is smaller");
	if (numberOne==numberTwo)
        System.out.println("Numberone and numbertwo are same value");
	else
        System.out.println("Numberone and numbertwo are not the same value");
	if (numberOne % 2 == 0)
        System.out.println("Numberone is even");
	else
        System.out.println("Numberone is uneven");
	if (numberTwo%2 == 0)
        System.out.println("Numbertwo is even");
	else
        System.out.println("Number two is uneven");
	if (numberOne<0)
        System.out.println("Numberone is negative");
	else
        System.out.println("Numberone is positive" );
	if (numberTwo<0)
            System.out.println("Numbertwo is negative");
	else
            System.out.println("Numbertwo is positive" );
	if(numberOne>100)
        System.out.println("Numberone is greater than 100");
	else
        System.out.println("Numberone is not greater than 100");
        if(numberTwo>100)
            System.out.println("Numbertwo is greater than 100");
        else
            System.out.println("Numbertwo is not greater than 100");




    }
}



