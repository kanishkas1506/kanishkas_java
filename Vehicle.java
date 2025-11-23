public class Vehicle {
    protected String model;
    public Vehicle(String model) { this.model = model; }
    public void start() { System.out.println(model + " started"); }
}
