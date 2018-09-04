package ood.parkinglot;

class Receipt {

    private final ParkingSpot parkingSpot;

    Receipt(ParkingSpot parkingSpot) {

        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "parkingSpot=" + parkingSpot +
                '}';
    }

    ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
