package ood.parkinglot;

import java.util.HashMap;

public abstract class Vehicle {
    String vehicleNumber;
    SpotType spotNeeded;
    HashMap<String, ParkingSpot> location = new HashMap<String, ParkingSpot>();

    public void parkVehicle(ParkingSpot s) {
        location.put(this.vehicleNumber,s);
    }

        public void unPark(){

        }

    public abstract boolean isSpotAvailable(ParkingSpot spot);

}
