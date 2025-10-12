/*
ShopProgram - Instantiable Classes
Emanuel Ferreira
12-10-2025
 */

public class ShopProgram {
    
//variables

    public static final double APPLE_PRICE = 0.50;
    public static final double BANANA_PRICE = 0.30;
    public static final double MILK_PRICE = 1.20;
    public static final double BREAD_PRICE = 2.00;

    private int apples;
    private int bananas;
    private int milk;
    private int bread;
    private double total;

    //setters

    public void setApples(int apples){
        this.apples=apples;
    }

    public void setBananas(int bananas){
        this.bananas=bananas;
    }

    public void setMilk(int milk){
        this.milk=milk;
    }

    public void setBread(int bread){
        this.bread=bread;
    }

    //compute

    public void computeTotal(){
        total=(APPLE_PRICE*apples)+(BANANA_PRICE*bananas)+(MILK_PRICE*milk)+(BREAD_PRICE*bread);
    }

    //getters
    public double getTotal(){
        return total;
    }
}