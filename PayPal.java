public class PayPal implements Payment {
    public boolean pay(double amount) {
        System.out.println("Paid using PayPal: " + amount);
        return true;
    }
}

