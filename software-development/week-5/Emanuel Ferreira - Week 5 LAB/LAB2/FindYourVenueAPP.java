/*
FindYourVenue.java
Emanuel Ferreira
26.10.2025

*/

import java.util.Scanner;

public class FindYourVenueAPP {
    public static void main(String[] args) {
    //vars
    int stuYear;
    String stuProg;
    String venue;

    //objs
    Scanner keyboard=new Scanner(System.in);
    FindYourVenue myVenue=new FindYourVenue();

    //setters
    System.out.println("Enter your programme code: ");
    stuProg=keyboard.nextLine();
    myVenue.setStuProg(stuProg);

    System.out.println("Enter your year of study: ");
    stuYear=keyboard.nextInt();
    myVenue.setStuYear(stuYear);

    //compute
    myVenue.computeVenue();
    //getter
    venue=myVenue.getVenue();
    System.out.println("Hi! Your Big Night Out venue is: " + venue + "!");
    keyboard.close();
    }
}
