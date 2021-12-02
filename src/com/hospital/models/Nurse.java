package com.hospital.models;

public class Nurse  extends Person {

    private String department;
    private String professionNumber;
    private TimeSlot shiftSlot;
    private double salary;
    public Nurse() {

    }

    public Nurse(String department,String professionNumber,TimeSlot shiftSlot,double salary) {
        super();
        this.department = department;
        this.professionNumber = professionNumber;
        this.shiftSlot = shiftSlot;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProfessionNumber() {
        return professionNumber;
    }

    public void setProfessionNumber(String professionNumber) {
        this.professionNumber = professionNumber;
    }

    public TimeSlot getShiftSlot() {
        return shiftSlot;
    }

    public void setShiftSlot(TimeSlot shiftSlot) {
        this.shiftSlot = shiftSlot;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nurse [professionNumber=" + professionNumber + ",department=" + department + ", shiftSlot=" + shiftSlot + ", salary=" + salary + "]";
    }
}
