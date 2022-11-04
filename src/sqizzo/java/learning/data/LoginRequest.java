package sqizzo.java.learning.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Login requested");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public  void lower() {
        var lowerUsername = this.username.toLowerCase();
    }

}
