/*
Bin.java
Emanuel Ferreira
16.10.2025
*/

public class Bin {
    private String colour;
    private String day;
    private int houseNum;

    //constructor default
    public Bin(){
        colour = "";
        day = "";
        houseNum = 0;
    }

    //setters
    public void setColour(String colour){
        this.colour=colour;
    }

    public void setHouseNum(int houseNum){
        this.houseNum=houseNum;
    }

    //compute
    public void compute(){
        if (colour.equalsIgnoreCase("Brown")){
            if(houseNum%2==0){
                day="Monday";
            }
            else {
                day="Tuesday";
            }
        }
        else if (colour.equalsIgnoreCase("Black")){
            if(houseNum%2==0){
                day="Tuesday";
            }
            else {
                day="Wednesday";
            }
        } 
        else if (colour.equalsIgnoreCase("Green")) {
            if(houseNum%2==0){
                day="Wednesday";
            }
            else {
                day="Thursday";
            }
        }
    }

    //getters

    public String getDay(){
        return day;
    }
}
