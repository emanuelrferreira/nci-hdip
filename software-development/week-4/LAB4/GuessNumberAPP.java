/*
GuessNumberAPP.java
Emanuel Ferreira
15-10-2025

Lab 4 (advanced)
Research the use of the Math.random class for generating random numbers and then do the following:

Create a guessing game where the computer comes up with a random number and the user guesses (output winner or loser)
*/

import java.util.Scanner;
public class GuessNumberAPP {
    public static void main(String[] args) {
        //vars
        int userGuess;
        String result;

        //objs
        Scanner keyboard=new Scanner(System.in);
        GuessNumber gn=new GuessNumber();

        //inputs
        System.out.println("Choose a number from 1 to 10 to see if you can match the secret number: ");
        userGuess=keyboard.nextInt();
        gn.setUserGuess(userGuess);

        //process
        gn.computeGuess();

        //output
        result=gn.getResult();
        System.out.println(result);
        keyboard.close();
    }
}
