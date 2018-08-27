package ood.parkinglot;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        SpotType spotNeeded= SpotType.Regular;
    }


    @Override
    public boolean isSpotAvailable(ParkingSpot spot) {

        return false;
    }
}
