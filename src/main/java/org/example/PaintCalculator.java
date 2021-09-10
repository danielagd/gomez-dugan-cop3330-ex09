package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class PaintCalculator
{
    public static void main( String[] args )
    {
        // Program to calculate the amount of gallons to paint a ceiling

        final int one_gallon = 350;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the ceiling in feet? ");
        double length = input.nextDouble();

        // Checking for negative values
        while (length < 0) {
            System.out.print("Negative values are invalid. Please enter a positive length: ");
            length = input.nextDouble();
        }

        System.out.print("What is the width of the ceiling in feet? ");
        double width = input.nextDouble();

        // Checking for negative values
        while (width < 0) {
            System.out.print("Negative values are invalid. Please enter a positive width: ");
            width = input.nextDouble();
        }

        double area = length * width;
        int num_gallons = (int) (area / 350);

        int leftover_area = (int) (area % 350);
        if (leftover_area > 0)
            num_gallons++;

        // Changing of plural to singular depending on calculation
        if (num_gallons == 1)
            System.out.println("You will need to purchase " + num_gallons + " gallon of paint to cover " + area + " square feet.");
        else
            System.out.println("You will need to purchase " + num_gallons + " gallons of paint to cover " + area + " square feet.");
    }
}
