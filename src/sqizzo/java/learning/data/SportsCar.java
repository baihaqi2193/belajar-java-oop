package sqizzo.java.learning.data;

public class SportsCar implements Car {
    private String carName;
    private String engine;

    @Override
    public String toString() {
        return getCarName() + " powered by " + getEngine();
    }

    public SportsCar() {
        setEngine("Sports Car Engine");
        setCarName("Sports Car");
    }

    public SportsCar(String carName, String engine){
        setEngine(engine);
        setCarName(carName);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    @Override
    public boolean isPowerful() {
        boolean isPowerful = true;
        return isPowerful;
    }

    @Override
    public void drive() {
        System.out.println("You are driving Sport Car: " + carName);
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public int getTopSpeed() {
        return 350;
    }
}
