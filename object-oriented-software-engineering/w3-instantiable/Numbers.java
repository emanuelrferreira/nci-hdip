
// Numbers.java
// Emanuel Rodrigues Ferreira
// 9.10.2025

public class Numbers { // type of error should have being defined in a fle named.....
    
//Data members i.e. variables
private int num1, num2, total;

//Constructor

public Numbers(){
    num1=0;
    num2=0;
    total=0;
} //type of error that comes up is "illegal start of expression"
// type of error - if without an else

//Setters i.e. inputs
// 1 setter for every >>>>input<<<</question you ask the user out in your app class

public void setNum1(int num1){ //pulling(grabbing?) num1 from app class
    this.num1=num1; //saying that num1 in here is same as num1 in app class
}

public void setNum2(int num2 ){
    this.num2=num2;
}
//Compute i.e. process

public void compute(){
    total=num1+num2;
}
//Getters i.e. outputs
// 1 getter per output

public int getTotal(){ //grab the total value which is an interger
    return total; //retorn the total value to the app class
}

} //closes off class signatures - type of error is Reached end while parsing