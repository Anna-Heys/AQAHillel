package ua.hillel.homework3;

public class CheckOddEven {

    public static void main(String[] args) {

        int number = 111;

        int restOfNumber = number % 2;

        String result = restOfNumber == 0 ? "Even Number" : "Odd Number";

        System.out.println("BYE");
        System.out.println(result);

    }
}
