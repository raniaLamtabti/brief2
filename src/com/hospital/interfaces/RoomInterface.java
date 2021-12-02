package com.hospital.interfaces;

import com.hospital.models.Room;

import java.util.List;
import java.util.Optional;

public interface RoomInterface {

        public Optional<Room> getRoomByNumber(int number);

        public void addRoom(List<Room> rooms);

}
