package introdate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee (1978,3,21,"Fáy Levente");
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
