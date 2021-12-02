package com.hospital.Impl;

import com.hospital.interfaces.DoctorInterface;
import com.hospital.models.Doctor;
import com.hospital.models.TimeSlot;

import java.util.List;
import java.util.Optional;

public class DoctorImpl implements DoctorInterface {

    @Override
    public Optional<Doctor> getDoctorByProfessionNumber(String professionNumber){
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addDoctor(List<Doctor> doctors){
        // TODO Auto-generated method stub
        Doctor doctor1 = new Doctor("1D",new TimeSlot(3,8),578);
        doctor1.setFirstname("kamal");
        doctor1.setLastname("Molahi");
        doctor1.setPhone("0678959493");
        doctor1.setAddress("address 00");
        //doctor1.setId(1L + (long) (Math.random() * (10L - 1L)));

        Doctor doctor2 = new Doctor("2D",new TimeSlot(3,8),578);
        doctor2.setFirstname("Ahmed");
        doctor2.setLastname("Radi");
        doctor2.setPhone("0678959493");
        doctor2.setAddress("address 00");

        Doctor doctor3 = new Doctor("3D",new TimeSlot(3,8),578);
        doctor3.setFirstname("Laila");
        doctor3.setLastname("Zitouni");
        doctor3.setPhone("0678959493");
        doctor3.setAddress("address 00");

        Doctor doctor4 = new Doctor("4D",new TimeSlot(3,8),578);
        doctor4.setFirstname("Inssaf");
        doctor4.setLastname("Drif");
        doctor4.setPhone("0678959493");
        doctor4.setAddress("address 00");

        Doctor doctor5 = new Doctor("5D",new TimeSlot(3,8),578);
        doctor5.setFirstname("Rida");
        doctor5.setLastname("Riyad");
        doctor5.setPhone("0678959493");
        doctor5.setAddress("address 00");

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);


    }

}
