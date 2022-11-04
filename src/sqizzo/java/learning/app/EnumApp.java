package sqizzo.java.learning.app;

import sqizzo.java.learning.data.Customer;
import sqizzo.java.learning.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Haqi");
        customer.setLevel(Level.VIP);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        System.out.println(customer.customerGetLevelDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        String vip = "VIP";
        Level vipLevel = Level.valueOf(vip);
        System.out.println(vipLevel.getDescription());

        Level[] levels = Level.values();
        for (var level: levels) {
            System.out.println(level.name());
            System.out.println(level.getDescription());
        }
    }

}
