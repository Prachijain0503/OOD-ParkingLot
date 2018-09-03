package ood.parkinglot;

public class ParkingManager {
    private static boolean signal;

    public ParkingManager(boolean signal) {
        this.signal = signal;
    }

    public static void notifyAvailability(boolean b) {
        signal = b;
    }
}
