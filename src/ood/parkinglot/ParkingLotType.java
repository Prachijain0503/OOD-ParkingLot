package ood.parkinglot;


import java.util.Map;

interface ParkingLotType {
    ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots);

    public static final ParkingLotType FirstEMPTY = new ParkingLotType() {

        @Override
        public ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots) {
            return null;
        }

    };

    public static final ParkingLotType LASTEMPTY = new ParkingLotType() {

        @Override
        public ParkingSpot searchSpot(Map<ParkingSpot, Boolean> spots) {
            return null;
        }

    };

}
//public class FirstEmptyParkingLot extends ParkingLot {
//ParkingLot
//
//
//    @Override
//    ParkingSpot searchSpot() {
//        ArrayList<ParkingSpot> keys = new ArrayList<ParkingSpot>(spots.keySet());
//        for(int i=keys.size()-1; i>=0;i--){
//            if(spots.get(keys.get(i))== false)
//                return keys.get(i);
//        }
//        return null;
//    }
//}

/*

@Override
    ParkingSpot searchSpot() {
        ArrayList<ParkingSpot> keys = new ArrayList<ParkingSpot>(spots.keySet());
        for(int i=keys.size()-1; i>=0;i--){
          if(spots.get(keys.get(i))== false)
              return keys.get(i);
        }
        return null;
    }
*
 */
