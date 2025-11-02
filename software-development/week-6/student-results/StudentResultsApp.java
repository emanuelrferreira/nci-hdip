/*
StudentResultsApp.java
Emanuel Ferreira
01.11.2025
*/

import java.util.Scanner;

public class StudentResultsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentResults sr = new StudentResults();

        System.out.print("How many subjects do you take? ");
        int n;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
            } else {
                sc.next(); 
            }
            System.out.print("Invalid value. Please enter an integer > 0: ");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter mark for subject " + i + " (0-100): ");
            int mark = readMark(sc);
            sr.addMark(mark);
        }

        double avg = sr.average();
        char grade = sr.gradeFromAverage();

        System.out.printf("%nAverage: %.2f%n", avg);
        System.out.println("Grade (A–F): " + grade);

        sc.close();
    }

    private static int readMark(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int m = sc.nextInt();
                if (0 <= m && m <= 100) return m;
            } else {
                sc.next();
            }
            System.out.print("Invalid mark. Please enter an integer between 0 and 100: ");
        }
    }
}