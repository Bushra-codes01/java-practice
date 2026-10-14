import java.util.Scanner;

public class admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths marks");
        int mathsmarks = sc.nextInt();

        if (mathsmarks >= 60) {
            System.out.println("Enter your Physics marks");
            int physicsmarks = sc.nextInt();
            if (physicsmarks >= 50) {
                System.out.println("Enter your Chemistry marks");
                int chemistrymarks = sc.nextInt();
                if (chemistrymarks >= 50) {
                    System.out.println("Eligible for Admission");
                } else {
                    System.out.println("Not eligible Maths marks are below 60 ");
                }
            } else {
                System.out.println("Not eligible physics marks are below 50");
            }
        } else {
            System.out.println("Not eligible chemistry marks are below 50");
        }
        sc.close();
    }
}