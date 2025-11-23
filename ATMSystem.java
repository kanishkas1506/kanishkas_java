 import java.util.Scanner;
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("12345", "User", 1000);
        boolean run = true;
        while (run) {
            System.out.println("1.Check Balance 2.Deposit 3.Withdraw 4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(acc.getBalance());
                    break;
                case 2:
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;
                case 3:
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    break;
                case 4:
                    run = false;
            }
        }
    }
}
