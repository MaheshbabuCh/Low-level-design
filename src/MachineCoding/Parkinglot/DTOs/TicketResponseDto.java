package MachineCoding.Parkinglot.DTOs;

import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Models.Vehicle;

import java.util.Date;

public class TicketResponseDto {

    private int spotNumber;

    private int floorNumber;

    private String vehicleNumber;

    private VehicleType vehicleType;

    private String operatorName;

    private Date entryTime;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

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

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Please find the ticket details here : \n" +
                "  spotNumber=" + spotNumber + "\n" +
                "  floorNumber=" + floorNumber + "\n" +
                "  vehicleNumber='" + vehicleNumber + '\'' + "\n" +
                "  vehicleType=" + vehicleType + "\n" +
                "  operatorName='" + operatorName + '\'' + "\n" +
                "  entryTime=" + entryTime + "\n" +
                "\nThank you for using our service!";
    }
}
