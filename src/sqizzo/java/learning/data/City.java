package sqizzo.java.learning.data;

import sqizzo.java.learning.annotation.Fancy;


public class City extends Location{
    @Override
    public void echoName() {
        System.out.println("City name:" + super.name);
    }
}
