package com.hospital.models;

import java.util.List;

public class Hospital {

	private Long id;
	private String name;
	private String city;
	private List<Doctor> doctors;
	private List<Nurse> nurses;
	private List<Room> rooms;
	private List<Patient> patients;
	
	public Hospital() {
		
	}
	
	public Hospital(String name,String city,List<Doctor> doctors, List<Nurse> nurses,List<Room> rooms ,List<Patient> patients) {
		this.id = 1L + (long) (Math.random() * (10L - 1L));
		this.name = name;
		this.city = city;
		this.doctors = doctors;
		this.rooms = rooms;
		this.patients = patients;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", city=" + city + ", doctors=" + doctors + ", rooms=" + rooms
				+ "]";
	}
	
}
