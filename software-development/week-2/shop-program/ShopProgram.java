import java.util.Scanner; // bringing in a package that we can use for user input
public class ShopProgram {
    public static void main(String[] args){

		// objects
		// bringing in the scanner and giving it the name keyboard;
		// created an instance of the scanner class so that we can use it whitin our application here;
		// system.in - allow for user input;
		Scanner keyboard=new Scanner(System.in);

		// variables
		// storing the cost price of each item
		final double APPLEPRICE = 0.50;
		final double BANANAPRICE = 0.30;
		final double MILKPRICE = 1.20;
		final double BREADPRICE = 2.00;
		//storing the amount of each product coming in from the user
		int apples;
		int bananas;
		int milk;
		int bread;
		// storing the total cost of the shopping
		double total;

		// INPUT
		// asks the question
		System.out.println("How many apples do you want?");
		// grabbing the integer from the user and storing it in a variable
		apples=keyboard.nextInt();

		System.out.println("How many bananas do you want?");
		bananas=keyboard.nextInt();

		System.out.println("How many milk do you want?");
		milk=keyboard.nextInt();

		System.out.println("How many bread do you want?");
		bread=keyboard.nextInt();


		// PROCESS
		total=(APPLEPRICE*apples)+(BANANAPRICE*bananas)+(MILKPRICE*milk)+(BREADPRICE*bread);

		//OUTPUT
		System.out.println("The total of your shopping is "+total);

    }
}








/* ?? Java Shop Program – Brief
 Create a program that asks the user how many of the following four items they want to buy:
Apples (€0.50 each)
Bananas (€0.30 each)
Milk (€1.20 each)
Bread (€2.00 each)
The program should then calculate the total cost of the shopping and display it back to the user. */