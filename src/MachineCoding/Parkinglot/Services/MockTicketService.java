package MachineCoding.Parkinglot.Services;

import MachineCoding.Parkinglot.DesignPatterns.Strategies.SpotAllocationStrategy;
import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Exceptions.GateNotFoundException;
import MachineCoding.Parkinglot.Models.*;
import MachineCoding.Parkinglot.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parkinglot.Repositories.GateRepository;
import MachineCoding.Parkinglot.Repositories.ParkingLotRepository;
import MachineCoding.Parkinglot.Repositories.TicketRepository;
import MachineCoding.Parkinglot.Repositories.VehicleRepository;

import java.util.Optional;

public class MockTicketService {

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;
    SpotAllocationStrategy spotAllocationStrategy;
    TicketRepository ticketRepository;

    public MockTicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
                             ParkingLotRepository parkingLotRepository, SpotAllocationStrategy spotAllocationStrategy, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.ticketRepository = ticketRepository;
    }


    public Ticket createTicket(String vehicleNumber, VehicleType vehicleType, Long gateId) throws GateNotFoundException {


        //1. Get the gate by gateId from the db
        Optional<Gate> gateOptional = gateRepository.findGateByID(gateId);

        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate = gateOptional.get();

        //2. Get the operator from the gate
        Operator operator = gate.getCurrentOperator();

        //3. Get the vehicle by vehicleNumber from the db
        Optional<Vehicle> optionalVehicle = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if(optionalVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.vehicles.put(vehicleNumber, vehicle);
        }else {
            vehicle = optionalVehicle.get();
        }

        //4. get the parking lot from the gate

       // parkingLotRepository.setVehicleRepository(vehicleRepository);

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.getParkingLotOfGate(gate);

        if(parkingLotOptional.isEmpty()){
            throw new ParkingLotNotFoundException("Parking lot not found");
        }
        ParkingLot parkingLot = parkingLotOptional.get();

        //5. get the parking spot from the parking lot

        Optional<ParkingSpot> parkingSpotOptional = spotAllocationStrategy.allocateSpot(vehicle,parkingLot);

        if(parkingSpotOptional.isEmpty()){
            // No parking spot available
            return null;
        }
        ParkingSpot parkingSpot = parkingSpotOptional.get();

        // 6. Create a ticket

        Ticket ticket = new Ticket();

        ticket.setGate(gate);
        ticket.setOperator(operator);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(new java.util.Date());

        ticketRepository.save(ticket);

        return ticket;
    }
}
