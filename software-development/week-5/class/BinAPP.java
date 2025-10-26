/*
BinAPP.java
Emanuel Ferreira
16.10.2025
*/


import java.util.Scanner;
public class BinAPP {
    public static void main(String[] args) {
        //vars
        String colour;
        String day;
        int houseNum;

        //objs
        Scanner keyboard=new Scanner(System.in);
        Bin b=new Bin();

        //inputs-setters
        System.out.println("Welcome to the Bin Collection App!");
        System.out.println("What is the been colour? Please enter either Brown, Black or Green.");
        colour=keyboard.nextLine();
        b.setColour(colour);

        //validation
        while (!colour.equalsIgnoreCase("Black")&&!colour.equalsIgnoreCase("Brown")&&!colour.equalsIgnoreCase("Green")) {
            System.out.println("This not a valid colour. Please enter Brown, Black or Green");
            colour=keyboard.next();
        }

        System.out.println("What is your house number?");
        houseNum=keyboard.nextInt();
        b.setHouseNum(houseNum);

        //compute
        b.compute();

        //output-getters
        day=b.getDay();
        System.out.println("Your bin will be colected on "+day);
        keyboard.close();
    }
}
