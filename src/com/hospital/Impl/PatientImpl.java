package com.hospital.Impl;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PatientImpl implements PatientInterface {

    @Override
    public Optional<Patient> getPatientByAffiliationNumber(String affiliationNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addPatient(List<Patient> patients) {
        // TODO Auto-generated method stub
        Date date1 = new Date(2021, Calendar.FEBRUARY,25);
        Patient patient1 = new Patient(date1, "P1", InsuranceType.CNOPS, 20000);
        patient1.setFirstname("kamal");
        patient1.setLastname("Ahmed");
        patient1.setPhone("0678959493");
        patient1.setAddress("address 00");

        Date date2 = new Date(2021, Calendar.FEBRUARY,25);
        Patient patient2 = new Patient(date2, "P2",InsuranceType.CNSS, 10000);
        patient2.setFirstname("Nassir");
        patient2.setLastname("Nori");
        patient2.setPhone("0678959493");
        patient2.setAddress("address 00");

        Date date3 = new Date(2021, Calendar.FEBRUARY,25);
        Patient patient3 = new Patient(date3, "P3",InsuranceType.RAMED,300);
        patient3.setFirstname("Karim");
        patient3.setLastname("Barragi");
        patient3.setPhone("0678959493");
        patient3.setAddress("address 00");

        Date date4 = new Date(2021, Calendar.FEBRUARY,25);
        Patient patient4 = new Patient(date4, "P4",InsuranceType.CNOPS,50000);
        patient4.setFirstname("Walid");
        patient4.setLastname("Moli");
        patient4.setPhone("0678959493");
        patient4.setAddress("address 00");

        Date date5 = new Date(2021, Calendar.FEBRUARY,25);
        Patient patient5 = new Patient(date5, "P5",InsuranceType.RAMED,600);
        patient5.setFirstname("Hamza");
        patient5.setLastname("Sabir");
        patient5.setPhone("0678959493");
        patient5.setAddress("address 00");

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);

    }
}
