package ua.com.univerpulse;

/**
 * Created by svivanov on 23.03.16.
 */
public enum OperationEnum {
    add("Additional"),
    sub("Subtraction"),
    mul("Multiplication"),
    div("Division");

    private String shortOperationName;

    OperationEnum(String shortOperationName) {
        this.shortOperationName = shortOperationName;
    }

    public String getShortOperationName() {
        return this.shortOperationName;
    }
}