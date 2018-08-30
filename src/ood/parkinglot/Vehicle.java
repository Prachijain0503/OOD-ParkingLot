package ood.parkinglot;

import java.util.HashMap;

public abstract class Vehicle {
    String vehicleNumber;
    SpotType spotNeeded;
    ParkingLot parkingLot = new ParkingLot();

        public void unPark(Vehicle vehicle){
        parkingLot.unPark(vehicle);
        }

    public abstract boolean isSpotAvailable(ParkingSpot spot);

    public void park(Vehicle vehicle) {

        parkingLot.parkVehicle(vehicle);
    }
}
