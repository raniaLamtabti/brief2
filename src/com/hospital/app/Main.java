package com.hospital.app;

import com.hospital.Impl.*;
import com.hospital.enumerations.Importance;
import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.LevelName;
import com.hospital.enumerations.OperationType;
import com.hospital.models.*;
import sun.awt.windows.WPrinterJob;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {


    static List<Doctor> doctors = new ArrayList<Doctor>();
    static DoctorImpl doctorImpl = new DoctorImpl();

    static List<Nurse> nurses = new ArrayList<Nurse>();
    static NurseImpl nurseImpl = new NurseImpl();

    static List<Patient> patients = new ArrayList<Patient>();
    static PatientImpl patientImpl = new PatientImpl();

    static List<Room> rooms = new ArrayList<Room>();
    static RoomImpl roomImpl = new RoomImpl();

    static List<Operation> operations = new ArrayList<Operation>();
    static OperationImpl operationImpl = new OperationImpl();


    static Scanner sc = new Scanner(System.in);

    static int choix;
    static String patientAf;
    static char exitCammand;

    static boolean commpaire(double wallet, double price){
        boolean result=false;
        if(wallet==price){
            result = true;
        }
        return result;
    }

    static void doctorMenu(){
        System.out.println("Doctor menu");
        System.out.println("Choose :");
        System.out.println("1. Doctors list");
        System.out.println("2. Add doctor");
        System.out.println("3. Exit");
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                doctorsList();
                break;
            case 2:
                addDoctor();
                break;
            case 3:
                mainMenu();
                break;
        }
    }

    static void doctorsList(){
        String leftAlignFormat = "| %-2s | %-10s | %-10s | %-10s | %-10s | %-6d | %-6d | %-7s |%n";

        System.out.format("+----+------------+------------+------------+------------+--------+--------+---------+%n");
        System.out.format("| PN |  firstname |  lastname  |    phone   |  address   | S Time | E Time | Salary  |%n");
        System.out.format("+----+------------+------------+------------+------------+--------+--------+---------+%n");

        for (Doctor d: doctors) {
            String s= Double.toString(d.getSalary());
            System.out.format(leftAlignFormat, d.getProfessionNumber(), d.getFirstname(), d.getLastname(), d.getPhone(), d.getAddress(), d.getShiftSlot().getStartTime(), d.getShiftSlot().getEndTime(),s);
        }
        System.out.format("+----+------------+------------+------------+------------+--------+--------+---------+%n");

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            doctorMenu();
        }
    }

    static void addDoctor(){
        System.out.println("Enter doctor information");
        Doctor doctor = new Doctor();
        System.out.println("Firstname:");
        doctor.setFirstname(sc.next());
        System.out.println("Lastname:");
        doctor.setLastname(sc.next());
        System.out.println("Phone:");
        doctor.setPhone(sc.next());
        System.out.println("Address:");
        doctor.setAddress(sc.next());
        System.out.println("Profession Number:");
        sc.nextLine();
        doctor.setProfessionNumber(sc.next());
        System.out.println("ShiftSlot Start time:");
        int startTime = sc.nextInt();
        System.out.println("ShiftSlot End time:");
        int endTime = sc.nextInt();
        doctor.setShiftSlot(new TimeSlot(startTime,endTime));
        System.out.println("Salary:");
        doctor.setSalary(sc.nextDouble());
        doctors.add(doctor);

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            doctorMenu();
        }
    }

    static void nurseMenu(){
        System.out.println("Nurse menu");
        System.out.println("Choose :");
        System.out.println("1. Nurses list");
        System.out.println("2. Add nurse");
        System.out.println("3. Exit");

        choix = sc.nextInt();
        switch (choix) {
            case 1:
                nursesList();
                break;
            case 2:
                addNurse();
                break;
            case 3:
                mainMenu();
                break;
        }
    }

    static void nursesList(){
        String leftAlignFormat = "| %-4s | %-10s | %-10s | %-10s | %-10s | %-6d | %-6d | %-7s |%n";

        System.out.format("+------+------------+------------+------------+------------+--------+--------+---------+%n");
        System.out.format("|  PN  |  firstname |  lastname  |    phone   |  address   | S Time | E Time | Salary  |%n");
        System.out.format("+------+------------+------------+------------+------------+--------+--------+---------+%n");

        for (Nurse n: nurses) {
            String s= Double.toString(n.getSalary());
            System.out.format(leftAlignFormat, n.getProfessionNumber(), n.getFirstname(), n.getLastname(), n.getPhone(), n.getAddress(), n.getShiftSlot().getStartTime(), n.getShiftSlot().getEndTime(),s);
        }
        System.out.format("+------+------------+------------+------------+------------+--------+--------+---------+%n");

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            nurseMenu();
        }
    }

    static void addNurse(){
        System.out.println("Enter doctor information");
        Nurse nurse = new Nurse();
        System.out.println("Firstname:");
        nurse.setFirstname(sc.next());
        System.out.println("Lastname:");
        nurse.setLastname(sc.next());
        System.out.println("Phone:");
        nurse.setPhone(sc.next());
        System.out.println("Address:");
        nurse.setAddress(sc.next());
        System.out.println("Profession Number:");
        sc.nextLine();
        nurse.setProfessionNumber(sc.next());
        System.out.println("Department:");
        nurse.setDepartment(sc.next());
        System.out.println("ShiftSlot Start time:");
        int startTime = sc.nextInt();
        System.out.println("ShiftSlot End time:");
        int endTime = sc.nextInt();
        nurse.setShiftSlot(new TimeSlot(startTime,endTime));
        System.out.println("Salary:");
        nurse.setSalary(sc.nextDouble());
        nurses.add(nurse);

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            nurseMenu();
            nurseMenu();
        }
    }

    static void patientMenu(){
        System.out.println("Patient menu");
        System.out.println("Choose :");
        System.out.println("1. Patients list");
        System.out.println("2. Add patient");
        System.out.println("3. Exit");

        choix = sc.nextInt();
        switch (choix) {
            case 1:
                patientsList();
                break;
            case 2:
                addPatient();
                break;
            case 3:
                mainMenu();
                break;
        }
    }

    static void patientsList(){
        String leftAlignFormat = "| %-4s | %-10s | %-10s | %-10s | %-10s | %-10s | %-9s |%n";

        System.out.format("+------+------------+------------+------------+------------+------------+-----------+%n");
        System.out.format("|  AN  |  firstname |  lastname  |    phone   |  address   | Entry Date | Insurance |%n");
        System.out.format("+------+------------+------------+------------+------------+------------+-----------+%n");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        for (Patient p: patients) {
            String d = dateFormat.format(p.getHospitalEntryDate());
            System.out.format(leftAlignFormat, p.getAffiliationNumber(), p.getFirstname(), p.getLastname(), p.getPhone(), p.getAddress(),d, p.getInsuranceType());
        }
        System.out.format("+------+------------+------------+------------+------------+------------+-----------+%n");

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            patientMenu();
        }
    }

    static void addPatient(){
        int insurance;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Enter doctor information");
        Patient patient = new Patient();
        System.out.println("Firstname:");
        patient.setFirstname(sc.next());
        System.out.println("Lastname:");
        patient.setLastname(sc.next());
        System.out.println("Phone:");
        patient.setPhone(sc.next());
        System.out.println("Address:");
        patient.setAddress(sc.next());
        System.out.println("Affiliation Number:");
        sc.nextLine();
        patient.setAffiliationNumber(sc.next());
        System.out.println("Insurance Type:");
        System.out.println("\t 1.CNSS");
        System.out.println("\t 2.RAMED");
        System.out.println("\t 3.CNOPS");
        insurance = sc.nextInt();
        switch (insurance) {
            case 1:
                patient.setInsuranceType(InsuranceType.CNSS);
                break;
            case 2:
                patient.setInsuranceType(InsuranceType.RAMED);
                break;
            case 3:
                patient.setInsuranceType(InsuranceType.CNOPS);
                break;
        }
        patient.setHospitalEntryDate(date);

        patients.add(patient);

        System.out.println("Press anny character and enter to go back");

        exitCammand = sc.next().charAt(0);
        if(exitCammand != ' '){
            patientMenu();
        }
    }

    static void operationMenu(){
        System.out.println("Operation menu");
        System.out.println("Choose :");
        System.out.println("1. Operations list");
        System.out.println("2. Add operation");
        System.out.println("3. Exit");

        choix = sc.nextInt();
        switch (choix) {
            case 1:
                patientsList();
                break;
            case 2:
                addOperation();
                break;
            case 3:
                mainMenu();
                break;
        }
    }

    static void addOperation(){
        Operation operation = new Operation();
        double wallet = 0;
        double price = 0;
        double rembouse = 0;
        Patient patientIn = new Patient();
        Room roomIn = new Room();
        String importance;
        System.out.format("Choose your patient:\n");
        for (Patient p: patients) {
            System.out.format("\t-"+p.getAffiliationNumber()+"\n");
        }
        patientAf = sc.next();
        for (Patient p: patients) {
            if (p.getAffiliationNumber().equals(patientAf)) {
                operation.setPatient(p);
                wallet = p.getWallet();
            }
        }
        System.out.format("Choose type of operation:\n");
        System.out.format("\t-1."+ OperationType.DENTISE+": "+ OperationType.DENTISE.getValue() +"\n");
        System.out.format("\t-2."+ OperationType.HEART+": "+ OperationType.HEART.getValue()  +"\n");
        System.out.format("\t-3."+ OperationType.EYE+": "+ OperationType.EYE.getValue()  +"\n");
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                price = OperationType.DENTISE.getValue();
                break;
            case 2:
                price = OperationType.HEART.getValue();
                break;
            case 3:
                price = OperationType.EYE.getValue();
                break;
        }
        if(wallet >= price){
            operation.setPrice(price);
            for (Patient p: patients) {
                if (p.getAffiliationNumber().equals(patientAf)) {
                    if (p.getInsuranceType().equals(InsuranceType.CNOPS)) {
                        rembouse = (price*80)/100;
                    }else if(p.getInsuranceType().equals(InsuranceType.RAMED)){
                        rembouse = (price*60)/100;
                    }else{
                        rembouse = (price*70)/100;
                    }
                }
            }
            System.out.format("The insurance will give you:"+ rembouse +"\n");
            System.out.format("What is the importance of the operation:\n");
            System.out.format("\t-1."+ Importance.NORMAL.getValue()+"\n");
            System.out.format("\t-2."+ Importance.URGENT.getValue() +"\n");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    importance = "normal";
                    operation.setImportance(Importance.NORMAL);
                    for (Room r: rooms) {
                        if (r.getStage().equals(LevelName.E1)){
                            roomIn = r;
                        }
                    }
                    break;
                case 2:
                    importance = "urgent";
                    operation.setImportance(Importance.URGENT);
                    for (Room r: rooms) {
                        if (r.getStage().equals(LevelName.RC) ){
                            roomIn =r;
                        }
                    }
                    break;
            }
            operation.setRoom(roomIn);
            Random rand = new Random();
            Doctor doctor = doctors.get(rand.nextInt(doctors.size()));
            operation.setDoctor(doctor);
            List<Nurse> nursesIn = new ArrayList<Nurse>();
            for (int i=0; i<=3;i++){
                Nurse nurse = nurses.get(rand.nextInt(nurses.size()));
                nursesIn.add(nurse);
            }
            operation.setNurse(nursesIn);
            operation.setReferenceNumber("O1");
            operations.add(operation);
            System.out.println("ok");
            System.out.println(operation);
        }else{
            System.out.println("no");
        }
    }

    static void mainMenu(){
        System.out.println("Operation menu");
        System.out.println("Choose :");
        System.out.println("1. Doctor");
        System.out.println("2. Nurse");
        System.out.println("3. Patient");
        System.out.println("4. Operation");

        int choix;
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                doctorMenu();
                break;
            case 2:
                nurseMenu();
                break;
            case 3:
                patientMenu();
                break;
            case 4:
                operationMenu();
                break;
            default:
                mainMenu();
        }
    }

    public static void main(String[] args) {

        doctorImpl.addDoctor(doctors);

        nurseImpl.addNurse(nurses);

        roomImpl.addRoom(rooms);

        patientImpl.addPatient(patients);

        Hospital hospital = new Hospital();
        hospital.setId(356L);
        hospital.setName("M6");
        hospital.setCity("Safi");
        hospital.setDoctors(doctors);
        hospital.setNurses(nurses);
        hospital.setRooms(rooms);
        hospital.setPatients(patients);

        System.out.println("hospital "+hospital.getName()+" in"+hospital.getCity());
        mainMenu();
    }


}
