import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your account balance is:");
        double Balance = sc.nextDouble();
        System.out.println("Withdrawal Amount");
        double withdrawal = sc.nextDouble();
        if (withdrawal % 100 == 0) {
            if (withdrawal <= Balance) {
                if (Balance - withdrawal >= 500) {
                    System.out.println("Withdrawal is allowed");
                } else {
                    System.out.println("Minimum balance of 500 is must be maintained");
                }
            } else {
                System.out.println("Insufficient balance");
            }

        } else {
            System.out.println("Amount must be a multiple of 100");
        }
        sc.close();

    }

}
