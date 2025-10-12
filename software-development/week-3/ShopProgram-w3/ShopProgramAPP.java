/*
ShopProgramAPP - Instantiable Classes
Emanuel Ferreira
12-10-2025
 */

import java.util.Scanner;

public class ShopProgramAPP {
    public static void main(String[] args) {

        //objs
        Scanner keyboard = new Scanner(System.in);
        ShopProgram cart = new ShopProgram();

        //inputs
        System.out.println("How many apples do you want?");
        cart.setApples(keyboard.nextInt());

        System.out.println("How many bananas do you want?");
        cart.setBananas(keyboard.nextInt());

        System.out.println("How many milk do you want?");
        cart.setMilk(keyboard.nextInt());

        System.out.println("How many bread do you want?");
        cart.setBread(keyboard.nextInt());

        //compute
        cart.computeTotal();

        //output
        System.out.println("The total of your shopping cart is "+cart.getTotal());
    }
}
