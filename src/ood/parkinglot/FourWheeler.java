package ood.parkinglot;

public class FourWheeler extends Vehicle {
    public FourWheeler(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        SpotType spotNeeded = SpotType.Compact;
    }

    @Override
    public boolean isSpotAvailable(ParkingSpot spot) {
        return false;
    }
}
