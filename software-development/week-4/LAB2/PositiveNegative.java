/*
PositiveNegative.java
Emanuel Ferreira
15-10-2025

Lab 2
Create an application that takes in a number from a user and outputs whether it is positive or negative
*/


public class PositiveNegative {
    // variables
    private int userNumber;
    private String answer;
    // setters
    public void setUserNumber(int userNumber){
        this.userNumber=userNumber;
    }
    // compute
    public void computeNumber(){
        if (userNumber >= 0){
            answer="positive";
        } else {
            answer="negative";
        }
    }
    //getters
    public String getAnswer(){
        return answer;
    }
}
