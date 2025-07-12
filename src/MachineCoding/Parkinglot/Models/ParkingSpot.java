package MachineCoding.Parkinglot.Models;

import MachineCoding.Parkinglot.Enums.SpotStatus;
import MachineCoding.Parkinglot.Enums.VehicleType;

import java.util.List;

public class ParkingSpot extends BaseAuditAttributes{

    private int spotNumber;

    private Vehicle vehicle;

    private SpotStatus status;

    private List<VehicleType> supportedVehicles;


    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public List<VehicleType> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<VehicleType> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }
}
