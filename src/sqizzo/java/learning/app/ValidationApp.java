package sqizzo.java.learning.app;

import sqizzo.java.learning.data.LoginRequest;
import sqizzo.java.learning.error.ValidationException;
import sqizzo.java.learning.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("haqi", null);
        try {
            ValidationUtil.validate(loginRequest);
            // Kalau error, ga pake sini
            System.out.println("Data Valid");
        } catch (ValidationException e) {
            System.out.println("BLANK Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NULL Error: " + e.getMessage());
        } finally {
            System.out.println("Validation ended");
        }

        ValidationUtil.validateRuntime(loginRequest);
    }
}
