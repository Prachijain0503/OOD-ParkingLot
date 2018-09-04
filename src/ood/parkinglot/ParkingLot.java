package ood.parkinglot;

import java.util.HashMap;
import java.util.Map;

class ParkingLot {

    private int totalSpots;
    private final Map<ParkingSpot, Boolean> spots;
    private ParkingLotType parkingLotType;

    private final Map<Receipt, Vehicle> location;

    protected ParkingLot(int totalSpots, ParkingLotType parkingLotType) {
        this.totalSpots = totalSpots;
        this.spots = new HashMap<>();
        this.parkingLotType = parkingLotType;
        location = new HashMap<>();
    }

    Receipt parkVehicle(Vehicle vehicle) {
        if (totalSpots > 0) {
            ParkingSpot emptySpot = searchSpot();
                Receipt receipt = new Receipt(emptySpot);
                location.put(receipt, vehicle);
                spots.put(emptySpot,true);
                totalSpots--;
                if(totalSpots==0) {
                    ParkingManager parkingManager = new ParkingManager();
                    parkingManager.notifyAvailability(false);
                }
                return receipt;

        }

        return null;
    }

    Vehicle unPark(Receipt receipt) {
        Vehicle vehicle = location.get(receipt);
        totalSpots++;
        if(totalSpots==1) {
            ParkingManager parkingManager = new ParkingManager();
            parkingManager.notifyAvailability(true);
        }
        spots.put(receipt.getParkingSpot(), false);
        return vehicle;

    }

     private ParkingSpot searchSpot(){
        return parkingLotType.searchSpot(spots);
     }

}
