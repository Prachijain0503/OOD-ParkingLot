package ood.parkinglot;

import java.util.Map;

public class FirstEmptyParkingLot extends ParkingLot {
    @Override
    ParkingSpot searchSpot() {

            for (Map.Entry<ParkingSpot,Boolean> s: spots.entrySet()) {
                if(s.getValue()==false)
                    return s.getKey();
            }
            return null;

    }
}
