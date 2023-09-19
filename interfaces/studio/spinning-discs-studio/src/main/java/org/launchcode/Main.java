package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("DAX", 700, "Joker", "CD");
        DVD myDVD = new DVD("Avatar", 1100, "Movie", "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myCD.storeData();
        myCD.readDiscWithLaser();
        myCD.writeDiscWithLaser();

        myDVD.spinDisc();
        myDVD.storeData();
        myDVD.readDiscWithLaser();
        myDVD.writeDiscWithLaser();
        System.out.println(myCD.name);
        System.out.println(myCD.capacity);
        System.out.println(myCD.contents);
        System.out.println(myCD.discType);

        System.out.println(myDVD.name);
        System.out.println(myDVD.capacity);
        System.out.println(myDVD.contents);
        System.out.println(myDVD.discType);
    }
}