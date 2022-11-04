class VicePresident extends Manager{
    @Override
    void sayHello(String name) {
        System.out.println("Vice President: Hello, " + name + ", my name is Vice President " + this.name);
    }

    void sayHelloLie(String name){
        super.sayHello(name);
    }

}
