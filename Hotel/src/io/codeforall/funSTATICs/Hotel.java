package io.codeforall.funSTATICs;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public Room checkIn(Person guest) {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.checkIn();
                System.out.println(guest.getName() + " checked into Room " + room.getRoomNumber());
                return room;
            }
        }
        System.out.println("No rooms available for " + guest.getName());
        return null;
    }

    public void checkOut(Room room, Person guest) {
        room.checkOut();
        System.out.println(guest.getName() + " checked out of Room " + room.getRoomNumber());
    }
}

