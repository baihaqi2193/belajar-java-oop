class Person {
    /**
     * Fields/properties: data yang bisa
     * disisipkan di dalam object
     * Harus dideklarasikan dulu di dalam
     * classnya
     */

    // Constructor overloading
    public  Person () {
        // this() akan memangggil constructor
        this("Joe", "Earth");
        System.out.println("Default Constructor dipanggil!");
        System.out.println("----------");
    }
    public Person(String name) {
        this(name, "Earth");
        System.out.println("Partial Constructor dipanggil!");
        System.out.println("----------");
    }

    public Person(String name, String paramAddress ) {
        this.name = name;
        address = paramAddress;
        System.out.println("Full Constructor dipanggil!");

    }

    // Fields
    String name;

    String address;
    final String speciesName = "Human";


    // Method
    void sayHello(String paramName) {
        System.out.println("Hello, " + paramName + ", i'm " + name);
    }

    void sayAddress(){
        System.out.println("I live in " + address);
    }

}


