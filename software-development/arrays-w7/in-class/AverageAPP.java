/*
AverageAPP.java
Emanuel Ferreira
6.11.2025

Create an application to ask the user for 5 integers, work out the average and send it back to the user

 */

import javax.swing.JOptionPane;

public class AverageAPP {
    public static void main(String args[]){

        //vars
        int arr[]=new int[5];
        int sum=0;
        int avg=0;

        //input - ask the user for the five number

        //1. loop to ask the question 5 times
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        }

        //process
        // start the loop at index zero and end the loop when the length of the array is found
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];//sum+=[i];
        }
        avg=sum/arr.length;

        //output
        JOptionPane.showMessageDialog(null,"The average is: "+avg);
    }
}
