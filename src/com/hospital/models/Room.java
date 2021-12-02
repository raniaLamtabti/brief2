package com.hospital.models;

import com.hospital.enumerations.LevelName;

public class Room {

	private int number;
	private LevelName stage;

	public Room(){}
	public Room(int number, LevelName stage) {
		this.number = number;
		this.stage = stage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LevelName getStage() {
		return stage;
	}

	public void setStage(LevelName stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", stage=" + stage + "]";
	}
}
