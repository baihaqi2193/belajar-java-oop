public class VariableHidingApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Jake";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        Parent parent1 = new Parent();

        parent.doIt();
        parent1.doIt();
        System.out.println(parent.name);
    }
}
