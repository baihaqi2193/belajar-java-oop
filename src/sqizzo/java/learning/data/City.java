package sqizzo.java.learning.data;

public class City extends Location{
    @Override
    public void echoName() {
        System.out.println("City name:" + super.name);
    }
}
