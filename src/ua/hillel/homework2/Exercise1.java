package ua.hillel.homework2;

public class Exercise1 {

    public static void main(String[] args) {

        double tFahrenheit = 97.88;

        double tCentigrade = (double) 5 / 9 * (tFahrenheit - 32);

        double tKelvin = tCentigrade + 273.16;


        System.out.println(tCentigrade + " C : " + tFahrenheit + " F; " + tKelvin + " K");

    }
}
