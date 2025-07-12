package MachineCoding.Parkinglot.Models;

import MachineCoding.Parkinglot.Enums.VehicleType;

public class Vehicle extends BaseAuditAttributes{

private String vehicleNumber;
private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
