package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("A CD stores data.");
    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("Laser writes data to CD.");
    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("Laser reads data from CD");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
