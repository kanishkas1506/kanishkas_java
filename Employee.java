public class Employee {
    public int id;
    protected String department;
    String name;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() { 
        return salary; 
    }
}
