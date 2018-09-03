package ood.parkinglot;

class Receipt {

    private final ParkingSpot parkingSpot;

    Receipt(ParkingSpot parkingSpot) {

        this.parkingSpot = parkingSpot;
    }


    ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
