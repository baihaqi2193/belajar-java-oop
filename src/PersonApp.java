public class PersonApp {
    public static void main(String[] args) {
        // Declaring objects
        var person1 = new Person("Baihaqi", "Central Java");
        Person person2 = new Person("Khannedy", "Jakarta");
        Person person3 = new Person("Aldo");
        Person person4 = new Person();

        // Chenging fields data
        person2.address = person2.address.toUpperCase();



        // Accessing fields on object
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.speciesName);
        person1.sayHello(person2.name);
        person2.sayAddress();

    }
}
