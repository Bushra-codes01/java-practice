import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ATM pin:");
        int Pin = sc.nextInt();
         if (Pin == 1234) {
        System.out.println("Enter your balance Amount:");
        int balance = sc.nextInt();
        System.out.println("Enter your withdrawal Amount:");
        int Amount = sc.nextInt();
        
            if (Amount > 0) {
                System.out.println("amount is valid");

                if (Amount <= balance) {
                    System.out.println("You can withdraw");
                    System.out.println("Your current balance is :"+( balance-Amount));
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else {
                System.out.println("please enter a valid amount");
            }
        } else {
            System.out.println("Invalid pin");
                           
        }
        sc.close();
    }
}
