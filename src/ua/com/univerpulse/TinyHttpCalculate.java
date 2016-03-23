package ua.com.univerpulse;

/**
 * Created by svivanov on 23.03.16.
 */
public class TinyHttpCalculate {
    private double operand1Value;
    private double operand2Value;
    private OperationEnum operation;

    public TinyHttpCalculate(double operand1Value, double operand2Value, String operation) {
        this.operand1Value = operand1Value;
        this.operand2Value = operand2Value;
        this.operation = OperationEnum.valueOf(operation);
    }

    public OperationEnum getOperation() {
        return operation;
    }

    public double calculate() {
        double result = 0;

        switch (operation) {
            case add: {
                result = operand1Value + operand2Value;
                break;
            }
            case sub: {
                result = operand1Value - operand2Value;
                break;
            }
            case mul: {
                result = operand1Value * operand2Value;
                break;
            }
            case div: {
                result = operand1Value / operand2Value;
                break;
            }
        }

        return result;
    }
}
