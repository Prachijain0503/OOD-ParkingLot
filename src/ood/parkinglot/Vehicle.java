package ood.parkinglot;

public class Vehicle {
    String vehicleNumber;
    SpotType spotNeeded;
    ParkingLot parkingLot = new FirstEmptyParkingLot();

    public Vehicle(String s) {
        this.vehicleNumber = s;
    }

    public void unPark(Receipt receipt){
        parkingLot.unPark(receipt);
        }

    public Receipt park(Vehicle vehicle) {

        Receipt receipt = parkingLot.parkVehicle(vehicle);
        return receipt;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
//    public boolean isSameVehicle(Vehicle vehicle){
//        if(vehicle.vehicleNumber == this.vehicleNumber){
//            re
//        }
//    }
}
