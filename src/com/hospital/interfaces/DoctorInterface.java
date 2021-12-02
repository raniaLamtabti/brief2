package com.hospital.interfaces;

import com.hospital.models.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorInterface {
    public Optional<Doctor> getDoctorByProfessionNumber(String professionNumber);

    public void addDoctor(List<Doctor> doctors);

}
