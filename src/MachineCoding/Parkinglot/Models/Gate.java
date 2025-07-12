package MachineCoding.Parkinglot.Models;

import MachineCoding.Parkinglot.Enums.GateStatus;
import MachineCoding.Parkinglot.Enums.GateType;

public class Gate {

    private GateType gateType;

    private GateStatus gateStatus;

    private int gateNumber;

    private Operator CurrentOperator;
}
