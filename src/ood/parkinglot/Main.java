package ood.parkinglot;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ParkingLot parkingLot = new ParkingLot(10, ParkingLotType.LASTEMPTY);
        Vehicle vehicle = new Vehicle("KA 1234");
        Receipt receipt = parkingLot.parkVehicle(vehicle);
        System.out.println(receipt.toString());
        vehicle = parkingLot.unPark(receipt);
        System.out.println(vehicle.toString());

        ParkingLot parkingLot1 = new ParkingLot(10, ParkingLotType.FirstEMPTY);


    }
}
