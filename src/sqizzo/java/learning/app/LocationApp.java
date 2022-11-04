package sqizzo.java.learning.app;

import sqizzo.java.learning.data.City;
import sqizzo.java.learning.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location();
//        Error karena abstract class ga bisa langsugn diinstansiasi

        Location city = new City();
        city.name = "Jakarta";
        city.echoName();
    }
}
