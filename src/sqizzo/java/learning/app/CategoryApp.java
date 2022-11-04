package sqizzo.java.learning.app;

import sqizzo.java.learning.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
//        category.id = null;

        category.setId(null);
        System.out.println(category.getId());
        category.setId("Not Null");
        System.out.println(category.getId());
    }
}
