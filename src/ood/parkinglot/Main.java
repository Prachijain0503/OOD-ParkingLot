package ood.parkinglot;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ParkingLot parkingLot = new ParkingLot(10, ParkingLotType.LASTEMPTY);
        Vehicle vehicle = new Vehicle("KA 1234");
        Receipt receipt = parkingLot.parkVehicle(vehicle);
        vehicle = parkingLot.unPark(receipt);
        System.out.println(vehicle.toString());

        ParkingLot parkingLot1 = new ParkingLot(10, ParkingLotType.FirstEMPTY);
        Vehicle vehicle1 = new Vehicle("KA 5678");
        Receipt receipt1 = parkingLot.parkVehicle(vehicle1);
        vehicle1 = parkingLot.unPark(receipt1);
        System.out.println(vehicle1.toString());


    }
}
