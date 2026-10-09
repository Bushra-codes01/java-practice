import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        char name = sc.nextLine().charAt(2);
        if (name >= 'A' && name <= 'Z') {
            System.out.println("Uppercase");

        } else if (name >= 'a' && name <= 'z') {
            System.out.println("Lowercase");
        } else if (name >= '0' && name <= '9') {
            System.out.println("Digit");
        }
        sc.close();

    }
}
