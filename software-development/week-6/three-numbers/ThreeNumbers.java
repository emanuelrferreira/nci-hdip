//Take in 3 numbers from a user and use them to set all 3 parts of the loop and print (Eg 1,10,2 would print from 1-10 in increments of 2)

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Choose your first number: ");
        int n1=keyboard.nextInt();

        System.out.println("Choose your second number: ");
        int n2=keyboard.nextInt();

        System.out.println("How much should I increase each time? ");
        int n3=keyboard.nextInt();

        if(n1<=n2){
            for(int i=n1;i<=n2;i=i+n3){
                System.out.println(i);
            }
        } else {
            for(int i=n1;i>=n2;i=i-n3){
                System.out.println(i);
            }
        }
        keyboard.close();
    }
}
