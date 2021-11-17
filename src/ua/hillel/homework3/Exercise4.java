package ua.hillel.homework3;

public class Exercise4 {
    public static void main(String[] args) {

        int sideA = 12;
        int sideB = 6;
        int sideC = 6;

        if (sideA == sideB | sideA == sideC) {
            System.out.println("This triangle is isosceles");
        } else if (sideB == sideA | sideB == sideC) {
            System.out.println("This triangle is isosceles");
        } else {
            System.out.println("This triangle is not isosceles");
        }

    }
}
