package ood.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    int rows;
    int totalSpots = 10;
    int regularSpots =5;
    int handicappedSpots =2;
    HashMap<ParkingSpot,Boolean> spots;

    HashMap<String, ParkingSpot> location = new HashMap<String, ParkingSpot>();

    public void parkVehicle(Vehicle vehicle) {
        if(totalSpots > 0) {
            ParkingSpot emptySpot = searchSpot(spots);
            if(emptySpot != null) {
                location.put(vehicle.vehicleNumber, emptySpot);
                totalSpots--;
            }
        }
    }

    public void unPark(Vehicle vehicle){
        ParkingSpot s = location.get(vehicle.vehicleNumber);
        totalSpots++;
        spots.put(s,false);

    }

    private ParkingSpot searchSpot(HashMap<ParkingSpot, Boolean> spots) {
        for (Map.Entry<ParkingSpot,Boolean> s: spots.entrySet()) {
            if(s.getValue()==false)
                return s.getKey();
        }
        return null;
    }

}
