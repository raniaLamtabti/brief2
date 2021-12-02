package com.hospital.Impl;

import com.hospital.interfaces.NurseInterface;
import com.hospital.models.Nurse;
import com.hospital.models.TimeSlot;

import java.util.List;
import java.util.Optional;

public class NurseImpl implements NurseInterface {
    @Override
    public Optional<Nurse> getNurseByProfessionNumber(int professionNumber){
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addNurse(List<Nurse> nurses){
        // TODO Auto-generated method stub
        Nurse nurse1 = new Nurse("Department 1", "N1D1",new TimeSlot(3,8),578);
        nurse1.setFirstname("Laila");
        nurse1.setLastname("Ahmed");
        nurse1.setPhone("0678959493");
        nurse1.setAddress("address 00");

        Nurse nurse2 = new Nurse("Department 1", "N2D1",new TimeSlot(3,8),578);
        nurse2.setFirstname("Nora");
        nurse2.setLastname("Radi");
        nurse2.setPhone("0678959493");
        nurse2.setAddress("address 00");

        Nurse nurse3 = new Nurse("Department 2", "N3D2",new TimeSlot(3,8),578);
        nurse3.setFirstname("Mina");
        nurse3.setLastname("Sami");
        nurse3.setPhone("0678959493");
        nurse3.setAddress("address 00");

        Nurse nurse4 = new Nurse("Department 2", "N4D2",new TimeSlot(3,8),578);
        nurse4.setFirstname("Marwa");
        nurse4.setLastname("Nasir");
        nurse4.setPhone("0678959493");
        nurse4.setAddress("address 00");

        Nurse nurse5 = new Nurse("Department 3", "N5D3",new TimeSlot(3,8),578);
        nurse5.setFirstname("Loubna");
        nurse5.setLastname("Romi");
        nurse5.setPhone("0678959493");
        nurse5.setAddress("address 00");

        nurses.add(nurse1);
        nurses.add(nurse2);
        nurses.add(nurse3);
        nurses.add(nurse4);
        nurses.add(nurse5);

    }
}
