package com.hospital.enumerations;

public enum OperationType {
    DENTISE(1000),
    HEART(20000),
    EYE(10000);

    private double value;

    OperationType(double value) {
        this.value = value;
    }


    public double getValue() {
        return value;
    }
}
