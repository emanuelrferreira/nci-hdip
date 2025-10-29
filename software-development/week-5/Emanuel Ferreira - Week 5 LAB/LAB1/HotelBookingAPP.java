/*
HotelBookingAPP.java
Emanuel Ferreira
26.10.2025

Develop an application that allows the user to book a hotel room. The user should be asked for their name, the required number of nights, and their age. The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. Please note: a booking can only be confirmed if the user is at least 18.

*/

import java.util.Scanner;

public class HotelBookingAPP {
    public static void main(String[] args) {
        //vars
        String guestName;
        int nightsNum;
        int guestAge;
        double totalCost;
        final int NIGHT_PRICE=90;
        //objs
        Scanner keyboard=new Scanner(System.in);
        HotelBooking booking=new HotelBooking();
        //setters
        System.out.println("Enter your name: ");
        guestName=keyboard.nextLine();
        booking.setGuestName(guestName);

        System.out.println("Enter the number of nights: ");
        nightsNum=keyboard.nextInt();
        booking.setNightsNum(nightsNum);

        System.out.println("Enter your age: ");
        guestAge=keyboard.nextInt();
        booking.setGuestAge(guestAge);

        //compute
        booking.computeTotalCost();
        //getters
        totalCost=booking.getTotalCost();
        keyboard.close();
    }
}
