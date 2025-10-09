// Numbers.java
// Emanuel Rodrigues Ferreira
// 9.10.2025

import java.util.*;
public class NumbersApp {
    public static void main(String[] args) {

        //variables
        int num1, num2, total;

        //objects
        Scanner keyboard=new Scanner(System.in); //create a copy of the util scanner for me to use it here in my app
        Numbers myNumbers=new Numbers(); // two files talking to each other 

        //inputs
        //ask the question
        System.out.println("Please enter your first number:");
        //store the answer
        num1=keyboard.nextInt(); //get the next int via the keyboard and store in num1
        //send this num1 out to my instan class
        myNumbers.setNum1(num1);
        //num2
        System.out.println("Please enter your second number:");
        num2=keyboard.nextInt();
        myNumbers.setNum2(num2);

        //process
        myNumbers.compute();

        //outputs
        total=myNumbers.getTotal();
        System.out.println("So the total of your two numbers is "+total);
    }
}
