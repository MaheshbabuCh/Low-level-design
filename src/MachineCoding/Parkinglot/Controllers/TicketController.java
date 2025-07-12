package MachineCoding.Parkinglot.Controllers;

import MachineCoding.Parkinglot.DTOs.TicketRequestDto;
import MachineCoding.Parkinglot.DTOs.TicketResponseDto;
import MachineCoding.Parkinglot.Services.TicketService;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDto createTicket(TicketRequestDto ticketRequestDto) {



        return null;
        // Logic to create a ticket
    }
}
