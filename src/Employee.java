public class Employee {
    String name;

    Employee(String name){
        this.name = name;
        System.out.println("Instance employee dibuat");
    }

    void sayHello(){
        System.out.println("Hello, im employee " + name);
    }

    void sayHello(String name){
        System.out.println("Hello, " + name);
    }

}
