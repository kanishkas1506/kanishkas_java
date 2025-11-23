public class Cash implements Payment {
    public boolean pay(double amount) {
        System.out.println("Paid using Cash: " + amount);
        return true;
    }
}
