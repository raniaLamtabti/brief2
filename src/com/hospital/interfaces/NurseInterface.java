package com.hospital.interfaces;

import com.hospital.models.Nurse;

import java.util.List;
import java.util.Optional;

public interface NurseInterface {
    public Optional<Nurse> getNurseByProfessionNumber(int professionNumber);
    public void addNurse(List<Nurse> nurses);
}
