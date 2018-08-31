package ood.parkinglot;

import java.util.ArrayList;

public class LastEmptyParkingLot extends ParkingLot {

    @Override
    ParkingSpot searchSpot() {
        ArrayList<ParkingSpot> keys = new ArrayList<ParkingSpot>(spots.keySet());
        for(int i=keys.size()-1; i>=0;i--){
          if(spots.get(keys.get(i))== false)
              return keys.get(i);
        }
        return null;
    }
}
