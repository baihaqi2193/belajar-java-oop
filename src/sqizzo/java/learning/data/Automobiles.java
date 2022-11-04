package sqizzo.java.learning.data;

public interface Automobiles {
    String getEngine();
    boolean isPowerful();


    default  String fuelType() {
        return "Petrol";
    };
}
