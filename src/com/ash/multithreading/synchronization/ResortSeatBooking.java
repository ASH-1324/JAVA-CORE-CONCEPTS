package com.ash.multithreading.synchronization;

public class ResortSeatBooking {

    int totalSeat = 10;

    public void bookSeat(int seat) {

        System.out.println("your request is under process........." + Thread.currentThread().getName());

        synchronized (this) {
            if (seat <= totalSeat) {
                System.out.println(seat + " seats book successfully");
                totalSeat -= seat;
                System.out.println("Seats left " + totalSeat);
            } else {
                System.out.println("insufficient seat entry!\nWe have only: " + totalSeat + " seat");
            }
            System.out.println("Thank you for using our application " + Thread.currentThread().getName());
        }
    }
}
