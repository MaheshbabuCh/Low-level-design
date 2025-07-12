package MachineCoding.Parkinglot.Models;

import java.util.Date;
import java.util.List;

public class Bill {

    private Date exitTime;

    private Gate gate;

    private int amount;

    private Operator operator;

    private Date totalTime;

    private Ticket ticket;

    private List<Payment> payments;

    private String paymentUrl;

}
