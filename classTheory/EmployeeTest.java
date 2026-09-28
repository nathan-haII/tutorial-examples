package classTheory;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("John Smith", 50000, 2020, 1, 15);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Hire day: " + e.getHireDay());

        e.raiseSalary(10);
        System.out.println("Salary after 10% raise: " + e.getSalary());
        System.out.println(e.toString());
    }
}