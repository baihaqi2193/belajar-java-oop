package sqizzo.java.learning.app;

public class StackTraceApp {
    public static void main(String[] args) {
        try
        {
            String[] names = {"Joe", "Abzu", "Zoey"};
            System.out.println(names[250]);

        }
        catch (Throwable throwable) {

            throwable.printStackTrace();

        }
    }
}
