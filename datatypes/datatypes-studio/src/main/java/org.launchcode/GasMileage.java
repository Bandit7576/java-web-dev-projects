package org.launchcode;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles traveled: ");
        int miles = input.nextInt();
        System.out.println("Enter the number of gallons of fuel used: ");
        int gallons = input.nextInt();

        int mileage = miles / gallons;

        System.out.println("You are getting " + mileage + " mpg!");
    }
}
