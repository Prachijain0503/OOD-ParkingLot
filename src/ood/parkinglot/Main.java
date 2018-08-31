package ood.parkinglot;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vehicle = new Vehicle("KA 1234");
        Receipt receipt = vehicle.park(vehicle);
        vehicle.unPark(receipt);

    }
}
