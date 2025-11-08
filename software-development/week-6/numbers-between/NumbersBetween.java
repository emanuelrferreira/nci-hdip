// Take in 2 numbers from a user and print all numbers between these 2

import java.util.Scanner;

public class NumbersBetween {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        //get 1st number
        System.out.println("Choose a number: ");
        int n1=keyboard.nextInt();
        //get 2nd number
        System.out.println("Choose another number: ");
        int n2=keyboard.nextInt();

        System.out.println("These are the numbers between "+n1+" and "+n2+": ");

        if(n1<=n2){
            for(int i=n1;i<=n2;i++){
                System.out.println(i);
            }
        } else {
            for(int i=n1;i>=n2;i--){
                System.out.println(i);
            }
        }

        keyboard.close();
    }
}


