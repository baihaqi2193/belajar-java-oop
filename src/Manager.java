class Manager extends Employee {
    String company;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Manager: Hello, " + name + ", my name is Manager " + this.name);
    }
}


