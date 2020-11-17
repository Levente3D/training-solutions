package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;

    public Company(List<Employee> employees){
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employees);
    }

    public Employee findEmployeeByName(String name){
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                return name;
            }
        }
        return null;
    }

    public List<String> listEmployeeNames(){
        List<String>names = new ArrayList<>();
        for (Employee employee : employees){
            names.add(employee.getName());
        }
        return names;
    }
}
