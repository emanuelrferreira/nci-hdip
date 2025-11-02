/*
BeerSong.java
Emanuel Ferreira
01.11.2025
*/


public class BeerSong {
    private int startBottles;

    public BeerSong(int startBottles) {
        if (startBottles < 0) startBottles = 0;
        this.startBottles = startBottles;
    }

    public void sing() {
        for (int n = startBottles; n >= 0; n--) {
            printVerse(n);
        }
    }

    private void printVerse(int n) {
        if (n > 1) {
            System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (n - 1) + " " + bottleWord(n - 1) + " of beer on the wall.\n");
        } else if (n == 1) {
            System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
        } else { // n == 0
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println("Go to the store and buy some more, " + startBottles + " " + bottleWord(startBottles) + " of beer on the wall.\n");
        }
    }

    private String bottleWord(int x) {
        return x == 1 ? "bottle" : "bottles";
    }
}
