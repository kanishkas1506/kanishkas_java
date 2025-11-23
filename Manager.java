public class Manager extends Employee {
    public Manager(int id, String name, String department, double salary) {
        super(id, name, department, salary);
    }

    public void show() {
        System.out.println(id);
        System.out.println(department);
        System.out.println(getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "John", "Sales", 50000);
        m.show();
    }
}

