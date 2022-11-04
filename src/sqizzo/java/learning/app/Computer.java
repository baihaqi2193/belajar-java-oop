package sqizzo.java.learning.app;

public class Computer {
    public static final int PROCESSORS;
    public boolean isOn;

    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
//        isOn = false; -> Error
    }

}
