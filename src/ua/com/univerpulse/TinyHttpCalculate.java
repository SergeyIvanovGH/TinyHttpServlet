package ua.com.univerpulse;

/**
 * Created by svivanov on 23.03.16.
 */
public class TinyHttpCalculate {
    Double operand1Value;
    Double operand2Value;
    String operation;

    public TinyHttpCalculate(Double operand1Value, Double operand2Value, String operation) {
        this.operand1Value = operand1Value;
        this.operand2Value = operand2Value;
        this.operation = operation;
    }

    public TinyHttpCalculate() {
        this.operand1Value = 0d;
        this.operand2Value = 0d;
        this.operation = "add";
    }

    public Double getOperand1Value() {
        return operand1Value;
    }

    public void setOperand1Value(Double operand1Value) {
        this.operand1Value = operand1Value;
    }

    public Double getOperand2Value() {
        return operand2Value;
    }

    public void setOperand2Value(Double operand2Value) {
        this.operand2Value = operand2Value;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double calculate() {
        Double result = 0d;

        switch (operation) {
            case "add": {
                result = operand1Value + operand2Value;
                break;
            }
            case "sub": {
                result = operand1Value - operand2Value;
                break;
            }
            case "mul": {
                result = operand1Value * operand2Value;
                break;
            }
            case "div": {
                result = operand1Value / operand2Value;
                break;
            }
        }

        return result;
    }
}
