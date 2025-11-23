public class CreditCard implements Payment {
    public boolean pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
        return true;
    }
}

