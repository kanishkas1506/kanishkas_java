public class PaymentProcessor {
    public void process(Payment p, double amt) {
        p.pay(amt);
    }

    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor();
        pp.process(new CreditCard(), 100);
        pp.process(new PayPal(), 50);
        pp.process(new Cash(), 20);
    }
}
