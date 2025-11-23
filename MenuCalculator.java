import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1.Add 2.Subtract 3.Exit");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter two numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Result: " + (x - y));
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
