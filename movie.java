import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tickets are available:(true/false)");
        boolean tickets = sc.nextBoolean();
        if (tickets == true) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Does student have a student ID");
                String ID = sc.next();
                if (ID.equalsIgnoreCase("yes")) {
                    System.out.println("You will get a 10 % discount on the movie ticket");

                } else {
                    System.out.println("You will get a regular ticket");
                }
            } else {
                System.out.println("Age requirement not met");
            }
        } else {
            System.out.println("Tickets are not available");
            sc.close();
        }
    }
}
