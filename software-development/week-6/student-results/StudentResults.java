/*
StudentResults.java
Emanuel Ferreira
01.11.2025
*/


import java.util.ArrayList;

public class StudentResults {
    private final ArrayList<Integer> marks = new ArrayList<>();

    public void addMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be 0..100");
        }
        marks.add(mark);
    }

    public int getCount() {
        return marks.size();
    }

    public double average() {
        if (marks.isEmpty()) return 0.0;
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.size();
    }

    // Bonus: grade A–F
    public char gradeFromAverage() {
        double avg = average();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }
}
