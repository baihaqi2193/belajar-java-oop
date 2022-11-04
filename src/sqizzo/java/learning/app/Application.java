package sqizzo.java.learning.app;

// import  java.lang.*;
// Default import for java language
import  sqizzo.java.learning.data.*;
// import sqizzo.java.learning.data.Product;
// import sqizzo.java.learning.data.ProductApp;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30000000);
        System.out.println(product);

//        System.out.println(product.name);
//        Error karena protected
        System.out.println(Computer.PROCESSORS);
    }
}
