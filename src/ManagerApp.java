public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Andi");
        VicePresident vicePresident = new VicePresident("Joko");


        vicePresident.sayHello();
        manager.sayHello();
        manager.sayHello(vicePresident.name);
        vicePresident.sayHello(manager.name);
        vicePresident.sayHelloLie(manager.name);
    }
}
