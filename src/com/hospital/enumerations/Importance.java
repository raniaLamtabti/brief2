package com.hospital.enumerations;

public enum Importance {
    URGENT("urgent"),
    NORMAL("Normal");

    private String value;

    Importance(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
