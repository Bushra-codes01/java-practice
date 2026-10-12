import java.util.Scanner;

public class drivingtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Driving test done?(true?false)");
        boolean drivingtest = sc.nextBoolean();
        if (drivingtest == true) {
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Licence can be issued");
            } else {
                System.out.println("Underage");
            }
        } else {
            System.out.println("Test not passed");
        }
        sc.close();
    }
}
