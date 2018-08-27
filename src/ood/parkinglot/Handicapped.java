package ood.parkinglot;

public class Handicapped extends Vehicle {
    public Handicapped(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        SpotType spotNeeded= SpotType.Handicapped;
    }

    @Override
    public boolean isSpotAvailable(ParkingSpot spot) {
        return false;
    }

}
