package sqizzo.java.learning.app;

import sqizzo.java.learning.data.SportsCar;

public class CarApp {
    public static void main(String[] args) {
        SportsCar gtr = new SportsCar("Nissan GT-R R34", "RB-26 DETT");
        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar);
        System.out.println(gtr);

        gtr.drive();
        System.out.println(gtr.getTopSpeed());
        System.out.println(gtr.getEngine());
        System.out.println(gtr.isPowerful());
        System.out.println(gtr.fuelType());
    }
}
