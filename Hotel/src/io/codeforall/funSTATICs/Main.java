package io.codeforall.funSTATICs;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5); // Create a hotel with 5 rooms

        Person guest1 = new Person("Tiago");
        Person guest2 = new Person("Gustavo");


        Room room1 = hotel.checkIn(guest1);


        Room room2 = hotel.checkIn(guest2);


        hotel.checkOut(room1, guest1);


        hotel.checkOut(room2, guest2);


        Room room3 = hotel.checkIn(guest1);
    }
}
