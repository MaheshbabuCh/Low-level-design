package MachineCoding.Parkinglot.Repositories;

import MachineCoding.Parkinglot.Models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {

    public Map<String, Vehicle> vehicles = new TreeMap<>();

    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber) {
        // This method should interact with the database to find a vehicle by its number.

        if(vehicles.containsKey(vehicleNumber)){
            return Optional.of(vehicles.get(vehicleNumber));
        } else {
            return Optional.empty();
        }
    }
}
