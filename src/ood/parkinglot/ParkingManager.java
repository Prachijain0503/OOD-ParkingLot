package ood.parkinglot;

public class ParkingManager {
    private boolean signal;

    public void notifyAvailability(boolean b) {

        this.signal = b;
    }
}
