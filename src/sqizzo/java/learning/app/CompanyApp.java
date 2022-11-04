package sqizzo.java.learning.app;

import sqizzo.java.learning.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Test");

        Company.Employee employee = company.new Employee();
        employee.setName("Aaron");
        System.out.println(employee.getCompanyName());
        System.out.println(employee.getName());
    }
}
