package MachineCoding.Parkinglot.DesignPatterns.Strategies;

import MachineCoding.Parkinglot.Enums.SpotStatus;
import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Models.ParkingFloor;
import MachineCoding.Parkinglot.Models.ParkingLot;
import MachineCoding.Parkinglot.Models.ParkingSpot;
import MachineCoding.Parkinglot.Models.Vehicle;

import java.util.Optional;

public class SpotAllocationStrategy {

    public Optional<ParkingSpot> allocateSpot(Vehicle vehicle, ParkingLot parkingLot){
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getStatus().equals(SpotStatus.AVAILABLE)){
                    if(parkingSpot.getSupportedVehicles().contains(vehicle.getVehicleType())){
                        parkingSpot.setVehicle(vehicle);
                        parkingSpot.setStatus(SpotStatus.OCCUPIED);
                        return Optional.of(parkingSpot);
                    }
                }
            }
        }
        return Optional.empty();
    }
}
