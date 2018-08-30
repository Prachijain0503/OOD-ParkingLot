package ood.parkinglot;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vehicle = new TwoWheeler("KA 1234");
        vehicle.park(vehicle);
        vehicle.unPark(vehicle);

    }
}
