/*

OverallGrade.java
Emanuel Ferreira
7.11.2025

Question 1
Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.

*/


public class OverallGrade {

    //vars
    private String[] subj;
    private double[] subjResult;
    private double avg;

    //constructor
    public OverallGrade(int numSubjects){
        subj=new String[numSubjects];
        subjResult=new double[numSubjects];
        avg=0.00;
    }

    //setters - for each input
    /*public void setSubj(String[] subj){
        this.subj=subj;
    } 

    public void setSubjResult(double[] subjResult){
        this.subjResult=subjResult;
    }*/

    //compute
    public void computeAverage() {
        double sum=0;
        for(int i=0;i<subj.length;i++){
            sum+=subjResult[i];
        }
        avg=sum/subjResult.length;
    }

    //getters

    public double getAvg(){
        return avg;
    }
}
