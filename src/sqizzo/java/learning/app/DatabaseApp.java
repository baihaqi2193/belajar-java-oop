package sqizzo.java.learning.app;

import sqizzo.java.learning.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, null);
    }

    public static void  connectDatabase(String username, String pwd) {
        if(username == null || pwd == null) {
            throw new DatabaseError("Can't connect to the database!");
        }
    }
}
