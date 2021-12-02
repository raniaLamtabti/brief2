package com.hospital.enumerations;

public enum InsuranceType {

    CNSS("CNSSSSS"),
    RAMED("RAMED"),
    CNOPS("CNOPS");

    private String value;

    InsuranceType(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

}
