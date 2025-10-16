/*
Cinema.java
Emanuel Ferreira
16.10.2025

Lab 1
Create a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below

Under 18: 10 euro

Over 18: 15 euro

*/

public class Cinema {
    //vars - data members
    private int userAge;
    private int ticketsNum;
    private int totalPrice;

    // constructor - default 
    public Cinema(){
        userAge=0;
        ticketsNum=0;
        totalPrice=0;
    }

    //setters - 1 setter per input
    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public void setTicketsNum(int ticketsNum){
        this.ticketsNum=ticketsNum;
    }

    //compute
    public void computeTotalPrice(){
        if (userAge>=18){
            totalPrice=ticketsNum*15;
        } else {
            totalPrice=ticketsNum*10;
        }
    }

    //getters
    public int getTotalPrice(){
        return totalPrice;
    }
}
