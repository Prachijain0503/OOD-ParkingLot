package ood.parkinglot;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ParkingLot parkingLot = new ParkingLot(10, Collections.EMPTY_MAP, ParkingLotType.LASTEMPTY);
        Vehicle vehicle = new Vehicle("KA 1234");
        Receipt receipt = parkingLot.parkVehicle(vehicle);
        vehicle = parkingLot.unPark(receipt);
        System.out.println(vehicle);

    }
}
