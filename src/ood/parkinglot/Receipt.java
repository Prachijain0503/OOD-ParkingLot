package ood.parkinglot;

import java.sql.Time;

public class Receipt {
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    Long time;

    public Receipt(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.time = System.nanoTime();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
