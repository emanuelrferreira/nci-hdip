/*
HotelBooking.java
Emanuel Ferreira
26.10.2025

Develop an application that allows the user to book a hotel room. The user should be asked for their name, the required number of nights, and their age. The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. Please note: a booking can only be confirmed if the user is at least 18.

*/

public class HotelBooking {
    //vars
    private String guestName;
    private int nightsNum;
    private int guestAge;
    private double totalCost;
    public static final int NIGHT_PRICE = 90;

    //constructor
    public HotelBooking(){
        guestAge=0;
        guestName="";
        nightsNum=0;
        totalCost=0;
    }

    //setters
    public void setGuestName(String guestName){
        this.guestName=guestName;
    }

    public void setGuestAge(int guestAge){
        this.guestAge=guestAge;
    }

    public void setNightsNum(int nightsNum){
        this.nightsNum=nightsNum;
    }

    //compute
    public void computeTotalCost(){
        if (guestAge>=18) {
            totalCost=nightsNum*NIGHT_PRICE;
            System.out.println("Booking confirmed for "+guestName+".");
            System.out.println("Number of nights: "+nightsNum);
            System.out.println("Total cost: €"+totalCost);
        }
        else {
            System.out.println("Sorry, "+guestName+". You must be at least 18 to book a room.");
        }
    }

    //getter
    public double getTotalCost(){
        return totalCost;
    }
}