public class Car extends Vehicle {
    public Car(String model) { super(model); }
    public void openTrunk() { System.out.println("Trunk opened"); }

    public static void main(String[] args) {
        Car c = new Car("Sedan");
        c.start();
        c.openTrunk();
    }
}
