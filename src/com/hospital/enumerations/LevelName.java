package com.hospital.enumerations;

public enum LevelName {
    E1("Etage 1"),
    RC("RC");

    private String value;

    LevelName(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

}
