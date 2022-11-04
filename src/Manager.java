class Manager {
    String name;
    void sayHello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Manager: Hello, " + name + ", my name is Manager " + this.name);
    }
}


