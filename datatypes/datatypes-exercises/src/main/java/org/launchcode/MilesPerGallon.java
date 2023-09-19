package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles traveled: ");
        Double miles = input.nextDouble();
        System.out.println("Enter number of gallons used: ");
        Double gallons = input.nextDouble();
        double  mpg = miles / gallons;

        System.out.println("You are getting " + mpg + " miles per gallon!");
    }
}
