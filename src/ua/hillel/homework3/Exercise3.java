package ua.hillel.homework3;

public class Exercise3 {

    public static void main(String[] args) {

        int first = 8;
        int second = -14;

        int comparisonResult = Math.abs(first) > Math.abs(second) ? first : second;

        System.out.println("Highest number is " + comparisonResult);

    }
}
