/*
PositiveNegativeAPP.java
Emanuel Ferreira
15-10-2025

Lab 2
Create an application that takes in a number from a user and outputs whether it is positive or negative
*/
import java.util.Scanner;
public class PositiveNegativeAPP {
    public static void main(String[] args) {
        //obj
        Scanner keyboard=new Scanner(System.in);
        PositiveNegative pn= new PositiveNegative();
        //input
        System.out.println("Choose a number: ");
        int userNumber=keyboard.nextInt();
        //set
        pn.setUserNumber(userNumber);
        //compute
        pn.computeNumber();
        //get
        String answer=pn.getAnswer();
        //output
        System.out.println("Your number is "+answer);
        keyboard.close();
    }
}
