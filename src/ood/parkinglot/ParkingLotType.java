package ood.parkinglot;


import java.util.ArrayList;
import java.util.Map;

interface ParkingLotType {
    ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots);

     ParkingLotType FirstEMPTY = new ParkingLotType() {

        @Override
        public ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots) {
            for(Map.Entry<ParkingSpot, Boolean> entry : spots.entrySet()){
                if(!entry.getValue())
                    return entry.getKey();
            }
       return null;
        }

    };

     ParkingLotType LASTEMPTY = new ParkingLotType() {

        @Override
        public ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots) {
            ArrayList<ParkingSpot> keys = new ArrayList<>(spots.keySet());
            for(int i=keys.size()-1; i>=0;i--){
                if(!spots.get(keys.get(i)))
                    return keys.get(i);
            }
            return null;
        }

    };

}

