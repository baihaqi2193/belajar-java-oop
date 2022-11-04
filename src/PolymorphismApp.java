public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Jacob");
        employee.sayHello();

        Employee employee1 = new Manager("Josh");
        employee1.sayHello("Aldo");

        Employee employee2 = new VicePresident("Jonathan");
        employee2.sayHello();
    }
}
