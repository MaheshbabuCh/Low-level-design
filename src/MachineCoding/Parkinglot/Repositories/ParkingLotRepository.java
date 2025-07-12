package MachineCoding.Parkinglot.Repositories;

import MachineCoding.Parkinglot.Enums.SpotStatus;
import MachineCoding.Parkinglot.Models.*;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {

    Map<Long, ParkingLot> parkingLots = new TreeMap<>();
    ParkingLot parkingLot = new ParkingLot();
    ParkingFloor parkingFloor = new ParkingFloor();
    ParkingSpot parkingSpot = new ParkingSpot();

//    {
//        parkingSpot.setId(1L);
//        parkingSpot.setSpotNumber(1);
//        parkingSpot.setStatus(SpotStatus.AVAILABLE);
//        Optional<Vehicle> optionalVehicle = vehicleRepository.getVehicleByNumber(vehicleNumber);
//        parkingSpot.setVehicle();
//    }
//
//    {
//        parkingFloor.getParkingSpots().add(parkingSpot);
//    }
//
//    {
//        parkingFloor.setId(1L);
//        parkingFloor.setFloorNumber(1);
//        parkingFloor.setParkingSpots();
//    }
//
//    {
//        parkingLot.setId(1L);
//        parkingLot.setName("Main Parking Lot");
//        parkingLot.setParkingFloors();
//        parkingLots.put(1L, parkingLot);
//    }
//    {
//
//    }

    public Optional<ParkingLot> getParkingLotOfGate(Gate gate){

        for(ParkingLot parkingLot : parkingLots.values()){
           if(parkingLot.getGates().contains(gate)){
                return Optional.of(parkingLot);
            }
        }
        return Optional.empty();
    }
}
