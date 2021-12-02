package com.hospital.Impl;

import com.hospital.enumerations.LevelName;
import com.hospital.interfaces.RoomInterface;
import com.hospital.models.Room;

import java.util.List;
import java.util.Optional;

public class RoomImpl implements RoomInterface {
    @Override
    public Optional<Room> getRoomByNumber(int number) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addRoom(List<Room> rooms){
        // TODO Auto-generated method stub
        Room room1 = new Room(1, LevelName.RC);


        Room room2 = new Room(2,LevelName.RC);

        Room room3 = new Room(3,LevelName.E1);

        Room room4 = new Room(4,LevelName.E1);

        Room room5 = new Room(5,LevelName.E1);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

    }

}
