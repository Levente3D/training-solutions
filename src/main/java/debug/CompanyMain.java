package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 1975);
        Employee employee2 = new Employee("Jack Doe", 1989);
        Employee employee3 = new Employee("James Doe", 1992);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee james = company.findEmployeeByName("James Doe");
        System.out.println(james.getName() + " " + james.getYearOfBirth());
        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}
