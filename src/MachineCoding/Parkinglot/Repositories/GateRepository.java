package MachineCoding.Parkinglot.Repositories;

import MachineCoding.Parkinglot.Models.Gate;
import MachineCoding.Parkinglot.Models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    Map<Long, Gate> gates = new TreeMap<>();

   Gate gate = new Gate();
   Operator operator = new Operator();
    {
        operator.setName("Operator 1");
        operator.setEmpId("OP123");
    }
    {
        gate.setGateNumber(1);
        gate.setGateType(MachineCoding.Parkinglot.Enums.GateType.ENTRY);
        gate.setGateStatus(MachineCoding.Parkinglot.Enums.GateStatus.OPEN);
        gate.setCurrentOperator(operator);
        gate.setID(1L);
        gates.put(1L, gate);
    }
    public Optional<Gate> findGateByID(Long gateId){

        if(gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
