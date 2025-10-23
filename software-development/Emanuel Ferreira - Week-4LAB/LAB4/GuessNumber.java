/*
GuessNumber.java
Emanuel Ferreira
15-10-2025

Lab 4 (advanced)
Research the use of the Math.random class for generating random numbers and then do the following:

Create a guessing game where the computer comes up with a random number and the user guesses (output winner or loser)
*/

public class GuessNumber {
    //vars
    private int userGuess;
    private int secretNum;
    private String result;

    //constructor
    public GuessNumber(){
        secretNum=0;
        userGuess=0;
        result="";
    }

    //setters
    public void setUserGuess(int userGuess){
        this.userGuess=userGuess;
    }

    //compute
    public void computeGuess(){
        secretNum=(int)(Math.random()*10)+1;
        System.out.println("Secret number is: "+secretNum);
        if (userGuess==secretNum) {
            result="Winner!";
        } else {
            result="Loser";
        }
    }
    //getter
    public String getResult(){
        return result;
    }
}
