package sqizzo.java.learning.app;

import sqizzo.java.learning.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Echo", "admin");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
    }
}
