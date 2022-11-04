public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        VicePresident vicePresident = new VicePresident();

        manager.name = "Mark";
        vicePresident.name = "Ashley";

        vicePresident.sayHello();
        manager.sayHello();
        manager.sayHello(vicePresident.name);
        vicePresident.sayHello(manager.name);
        vicePresident.sayHelloLie(manager.name);
    }
}
