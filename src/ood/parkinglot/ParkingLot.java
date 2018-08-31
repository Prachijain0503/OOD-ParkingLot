package ood.parkinglot;

import java.util.HashMap;
import java.util.Map;

public abstract class ParkingLot {
    int rows;
    int totalSpots;
    int regularSpots;
    int handicappedSpots;
    HashMap<ParkingSpot,Boolean> spots;

    HashMap<String, ParkingSpot> location = new HashMap<String, ParkingSpot>();

    public Receipt parkVehicle(Vehicle vehicle) {
        if(totalSpots > 0) {
            ParkingSpot emptySpot = searchSpot();
            if(emptySpot != null) {
                location.put(vehicle.vehicleNumber, emptySpot);
                Receipt receipt = new Receipt(vehicle, emptySpot);
                totalSpots--;
                return receipt;
            }
        }
        return null;
    }

    public void unPark(Receipt receipt){
        ParkingSpot s = location.get(receipt.getVehicle().getVehicleNumber());
        totalSpots++;
        spots.put(s,false);

    }

    abstract ParkingSpot searchSpot() ;

}
