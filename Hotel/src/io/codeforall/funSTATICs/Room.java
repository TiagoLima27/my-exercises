package io.codeforall.funSTATICs;

public class Room {
    private final int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkIn() {
        isAvailable = false;
    }

    public void checkOut() {
        isAvailable = true;
    }
}
