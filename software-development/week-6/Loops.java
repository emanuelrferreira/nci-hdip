//Ask the user for their name, say it back to the user and then ask them do they want to run the application again. Keep looping until they say no

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //vars
        String userName="";
        boolean repeat=true;
        String runAgain="";

        //objs
        Scanner keyboard=new Scanner(System.in);

        //loop
        while(repeat){
            //input
            System.out.println("Please enter your name: ");
            userName=keyboard.nextLine();

            //saying name back to the user
            System.out.println("So your name is "+userName);

            //asking if they want to run app again
            System.out.println("Do you want to run the application again? Yes or No?");
            runAgain=keyboard.nextLine();

            if(runAgain.equalsIgnoreCase("No")) {
                repeat=false;
            }
        }// ends loop
        keyboard.close();
    }
}
