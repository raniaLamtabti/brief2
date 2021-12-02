package com.hospital.interfaces;

import com.hospital.models.Operation;
import com.hospital.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientInterface {
    public Optional<Patient> getPatientByAffiliationNumber(String affiliationNumber);

    public void addPatient(List<Patient> patients);
}
