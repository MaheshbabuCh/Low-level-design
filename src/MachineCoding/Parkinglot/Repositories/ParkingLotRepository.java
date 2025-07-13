package MachineCoding.Parkinglot.Repositories;

import MachineCoding.Parkinglot.Enums.SpotStatus;
import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {

    VehicleRepository vehicleRepository;
    GateRepository gateRepository;
    Map<Long, ParkingLot> parkingLots = new TreeMap<>();
    ParkingLot parkingLot = new ParkingLot();
    ParkingFloor parkingFloor = new ParkingFloor();
    ParkingSpot parkingSpot = new ParkingSpot();

    public ParkingLotRepository(VehicleRepository vehicleRepository, GateRepository gateRepository) {
        this.vehicleRepository = vehicleRepository;
        // Initialize parking lot data here
        List<VehicleType> supportedTypes = new ArrayList<>();
        supportedTypes.add(VehicleType.BIKE); // Add more types as needed
        supportedTypes.add(VehicleType.CAR);

        parkingSpot.setSupportedVehicles(supportedTypes);
        parkingSpot.setId(1L);
        parkingSpot.setSpotNumber(1);
        parkingSpot.setStatus(SpotStatus.AVAILABLE);
        parkingSpot.setSupportedVehicles(supportedTypes);

        Vehicle vehicle = vehicleRepository.vehicles.get("ABC123");
        parkingSpot.setVehicle(vehicle);

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(parkingSpot);
        parkingFloor.setParkingSpots(parkingSpots);

        parkingFloor.setId(1L);
        parkingFloor.setFloorNumber(1);

        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(parkingFloor);
        parkingLot.setParkingFloors(parkingFloors);

        parkingLot.setId(1L);
        parkingLot.setName("Main Parking Lot");

        // Initialize gates list to avoid NullPointerException
        List<Gate> gates = new ArrayList<>();
        // Optionally, add a Gate object if needed
//         Gate gate = new Gate();
//         gate.setId(1L);
         gates.add(gateRepository.gates.get(1L));
        parkingLot.setGates(gates);

        parkingLots.put(1L, parkingLot);
    }

    public Optional<ParkingLot> getParkingLotOfGate(Gate gate) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            if (parkingLot.getGates() != null && parkingLot.getGates().contains(gate)) {
                return Optional.of(parkingLot);
            }
        }
        return Optional.empty();
    }
}