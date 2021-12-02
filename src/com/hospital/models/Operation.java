package com.hospital.models;

import com.hospital.Impl.OperationImpl;
import com.hospital.enumerations.Importance;
import com.hospital.enumerations.OperationType;

import java.util.List;

public class Operation extends OperationImpl {

    private String referenceNumber;
    private double price;
    private OperationType type;
    private Importance importance;
    private Room room;
    private List<Nurse> nurses;
    private Doctor doctor;
    private Patient patient;

    public Operation() {

    }

    public Operation(String referenceNumber,double price, OperationType type, Importance importance, Room room,List<Nurse> nurses, Doctor doctor, Patient patient) {
        super();
        this.referenceNumber = referenceNumber;
        this.price = price;
        this.type = type;
        this.importance = importance;
        this.room = room;
        this.nurses = nurses;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public List<Nurse> getNurse() {
        return nurses;
    }

    public void setNurse(List<Nurse> nurses) { this.nurses = nurses; }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient doctor) {
        this.patient = patient;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Operation [referenceNumber=" + referenceNumber + "\n price=" + price + "\n type=" + type + "\n importance=" + importance +"\n nurses=" + nurses +"\n doctor=" + doctor +"\n patient=" + patient +"\n  room=" + room + "]";
    }




}