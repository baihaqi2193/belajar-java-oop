class VicePresident extends Manager{
    @Override
    void sayHello(String name) {
        System.out.println("Vice President: Hello, " + name + ", my name is Vice President " + this.name);
    }

    public VicePresident(String name) {
        // Mengakses constructor dari parent
        // Harus diakses karena parent gak punya default konstruktor
        super(name);
        System.out.println("Tapi "+ name +" itu Vice Manager!");
    }

    void sayHelloLie(String name){
        super.sayHello(name);
    }

}
