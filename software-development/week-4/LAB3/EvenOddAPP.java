/*
EvenOddAPP.java
Emanuel Ferreira
15-10-2025

Lab 3
Create an application that takes in a number from a user and outputs whether it is odd or even
*/
import java.util.Scanner;

public class EvenOddAPP {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        EvenOdd c = new EvenOdd();

        System.out.print("Enter a number: ");
        int userNumber = keyboard.nextInt();

        c.setUserNumber(userNumber);
        c.computeNumber();

        String msg = c.getMsg();
        System.out.println("The number is " + msg);

        keyboard.close();
    }
}
