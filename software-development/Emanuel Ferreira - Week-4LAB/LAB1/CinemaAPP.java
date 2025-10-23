/*
CinemaAPP.java
Emanuel Ferreira
16.10.2025

Lab 1
Create a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below

Under 18: 10 euro

Over 18: 15 euro

*/

import java.util.Scanner;
public class CinemaAPP {
    public static void main(String[] args) {
        //vars
        int userAge;
        int ticketsNum;
        int totalPrice;

        //objs
        Scanner keyboard=new Scanner(System.in);
        Cinema c=new Cinema();

        //inputs
        System.out.println("What is your age?");
        userAge=keyboard.nextInt();
        c.setUserAge(userAge);

        System.out.println("How many tickets?");
        ticketsNum=keyboard.nextInt();
        c.setTicketsNum(ticketsNum);
        
        //process
        c.computeTotalPrice();

        //output
        totalPrice=c.getTotalPrice();
        System.out.println("Total to be pay is: "+totalPrice);
        keyboard.close();
    }
}
