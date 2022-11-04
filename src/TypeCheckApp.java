public class TypeCheckApp {
    public static void main(String[] args) {
        VicePresident vicePresident1 = new VicePresident("Alan");
        cast(vicePresident1);
    }


    static void cast(Employee employee) {
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Casted to Vice President");
        } else if (employee instanceof  Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Casted to Manager");
        } else {
            System.out.println("Casted to Employee (Default)");
        }
    }

}
