package MachineCoding.Parkinglot.Models;

import MachineCoding.Parkinglot.Enums.GateStatus;
import MachineCoding.Parkinglot.Enums.GateType;

public class Gate extends BaseAuditAttributes{

    private GateType gateType;

    private GateStatus gateStatus;

    private int gateNumber;

    private Operator CurrentOperator;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getCurrentOperator() {
        return CurrentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        CurrentOperator = currentOperator;
    }
}
