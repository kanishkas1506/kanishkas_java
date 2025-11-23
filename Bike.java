public class Bike extends Vehicle {
    public Bike(String model) { super(model); }
    public void kickStart() { System.out.println("Kick Start"); }

    public static void main(String[] args) {
        Bike b = new Bike("Sports");
        b.start();
        b.kickStart();
    }
}
