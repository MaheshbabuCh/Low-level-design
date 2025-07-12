package MachineCoding.Parkinglot.Models;

import MachineCoding.Parkinglot.Enums.PaymentMode;
import MachineCoding.Parkinglot.Enums.PaymentStatus;

public class Payment {

    private int amount;

    private PaymentStatus status;

    private PaymentMode paymentMode;

    private String thirdPartyRefId;
}
