package ood.parkinglot;

public class ParkingManager {
    private static boolean signal;

    public void notifyAvailability(boolean b) {
        signal = b;
    }
}
