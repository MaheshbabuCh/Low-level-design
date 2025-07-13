package MachineCoding.Parkinglot;

import MachineCoding.Parkinglot.Controllers.MockTicketController;
import MachineCoding.Parkinglot.Controllers.TicketController;
import MachineCoding.Parkinglot.DTOs.TicketRequestDto;
import MachineCoding.Parkinglot.DTOs.TicketResponseDto;
import MachineCoding.Parkinglot.DesignPatterns.Strategies.SpotAllocationStrategy;
import MachineCoding.Parkinglot.Enums.VehicleType;
import MachineCoding.Parkinglot.Repositories.GateRepository;
import MachineCoding.Parkinglot.Repositories.ParkingLotRepository;
import MachineCoding.Parkinglot.Repositories.TicketRepository;
import MachineCoding.Parkinglot.Repositories.VehicleRepository;
import MachineCoding.Parkinglot.Services.TicketService;
import MachineCoding.Parkinglot.Services.MockTicketService;

public class ParkingLotApplication {
    public static void main(String[] args) throws GateNotFoundException {

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(vehicleRepository, gateRepository);
        SpotAllocationStrategy spotAllocationStrategy = new SpotAllocationStrategy();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                spotAllocationStrategy,
                ticketRepository
        );

        MockTicketService mockTicketService = new MockTicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                spotAllocationStrategy,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        MockTicketController mockTicketController = new MockTicketController(mockTicketService);

        TicketRequestDto ticketRequest = new TicketRequestDto();
        ticketRequest.setVehicleNumber("ABC123");
        ticketRequest.setVehicleType(VehicleType.BIKE);
        ticketRequest.setGateId(1L);

        TicketResponseDto responseDto = mockTicketController.createTicket(ticketRequest);

        if (responseDto != null) {
            System.out.println(responseDto.toString());
        } else {
            System.out.println("No ticket generated.");
        }

        System.out.println("Application started successfully at port 8080");
    }
}