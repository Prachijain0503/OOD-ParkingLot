package ood.parkinglot;

public class ParkingSpot {

    Vehicle vehicle;
    SpotType spotType;
  int row;
  int spotNumber;

    public ParkingSpot(Vehicle vehicle, SpotType spotType, int row, int spotNumber) {
        this.vehicle = vehicle;
        this.spotType = spotType;
        this.row = row;
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }
}
