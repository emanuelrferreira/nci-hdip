/*
EvenOdd.java
Emanuel Ferreira
15-10-2025

Lab 3
Create an application that takes in a number from a user and outputs whether it is odd or even
*/

public class EvenOdd {   
    private int userNumber;
    private String msg;

    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    public void computeNumber(){
        if (userNumber % 2 == 0) {
            msg = "even";
        } else {
            msg = "odd";
        }
    }

    public String getMsg(){
        return msg;
    }
}

