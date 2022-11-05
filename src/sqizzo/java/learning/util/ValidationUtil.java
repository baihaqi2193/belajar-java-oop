package sqizzo.java.learning.util;

import sqizzo.java.learning.data.LoginRequest;
import sqizzo.java.learning.error.ValidateRuntime;
import sqizzo.java.learning.error.ValidationException;

import java.io.IOException;

public class ValidationUtil {

    public static void  validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void  validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidateRuntime("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidateRuntime("Password is blank");
        }
    }
}
