package com.ash.multithreading.synchronization;

public class BookingApp extends Thread {

    int seats;
    static ResortSeatBooking booking;

    @Override
    public void run() {
        booking.bookSeat(seats);
    }

    public static void main(String[] args) {
        booking = new ResortSeatBooking();

        BookingApp ash = new BookingApp();
        ash.setName("ash");       //Setting thread name
        ash.seats = 6;
        ash.start();

        BookingApp max = new BookingApp();
        max.setName("max");
        max.seats = 7;
        max.start();
    }
}
