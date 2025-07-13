package MachineCoding.Parkinglot.Controllers;

import MachineCoding.Parkinglot.DTOs.TicketRequestDto;
import MachineCoding.Parkinglot.DTOs.TicketResponseDto;
import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Exceptions.GateNotFoundException;
import MachineCoding.Parkinglot.Models.Ticket;
import MachineCoding.Parkinglot.Services.MockTicketService;

public class MockTicketController {

    MockTicketService ticketService;

    public MockTicketController(MockTicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDto createTicket(TicketRequestDto request) throws GateNotFoundException {

        String vehicleNumber = request.getVehicleNumber();
        VehicleType vehicleType = request.getVehicleType();
        Long gateId = request.getGateId();

        Ticket ticket = new Ticket();

        ticket = ticketService.createTicket(vehicleNumber, vehicleType, gateId);

        TicketResponseDto response = new TicketResponseDto();

        response.setEntryTime(ticket.getEntryTime());
        response.setOperatorName(ticket.getOperator().getName());
        response.setSpotNumber(ticket.getParkingSpot().getSpotNumber());
        response.setVehicleType(ticket.getVehicle().getVehicleType());
        response.setVehicleNumber(ticket.getVehicle().getVehicleNumber());
        response.setFloorNumber(1);

        return response;
        // Logic to create a ticket
    }
}
