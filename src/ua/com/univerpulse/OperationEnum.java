package ua.com.univerpulse;

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