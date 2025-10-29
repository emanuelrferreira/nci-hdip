/*
FindYourVenue.java
Emanuel Ferreira
26.10.2025

The Students Union is planning a Big Night Out event for all students but unfortunately, they couldn’t find a venue big enough to accommodate all courses together and so they have had to book 2 different venues and assign different programmes and years to each venue. They have asked you to develop an application that would enable a student to find out which venue their night out will be in. The application should allow the student to enter their programme code (this should facilitate both upper and lowercase text) and their year of study and should then calculate and output the venue where their night out will take place. The location of each night out is listed in the table below.

1
HDAIML
Lagoona
HDBC
Harbourmaster

2
HDAIML
Harbourmaster
HDBC
Lagoona

*/

public class FindYourVenue {
    //vars
    private int stuYear;
    private String stuProg;
    private String venue;

    //constructor
    public FindYourVenue(){
        stuYear=0;
        stuProg="";
        venue="";
    }

    //setter
    public void setStuYear(int stuYear){
        this.stuYear=stuYear;
    }

    public void setStuProg(String stuProg){
        this.stuProg=stuProg;
    }

    //compute
    public void computeVenue(){
        if (stuYear==1) {
            if (stuProg.equalsIgnoreCase("HDAIML")){
                venue="Lagoona";
            } else if (stuProg.equalsIgnoreCase("HDBC")){
                venue="Harbourmaster";
            } else {
                venue="Invalid programme";
            }
        }
        else if (stuYear==2){
            if (stuProg.equalsIgnoreCase("HDAIML")){
                venue="Harbourmaster";
            } else if (stuProg.equalsIgnoreCase("HDBC")) {
                venue="Lagoona";
            } else {
                venue="Invalid programme";
            }
        }
        else {
            venue="Inform the correct year";
        }
    }
    //getter
    public String getVenue(){
        return venue;
    }
}