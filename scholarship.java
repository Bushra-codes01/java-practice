import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        System.out.println("Enter your family income:");
        int income = sc.nextInt();
        if (marks >= 85) {
            if (income < 300000) {
                System.out.println("You are eligible for Scholarship");
            } else {
                System.out.println("You are not eligible for scholarship");
            }
        } else {
            System.out.println("You can't get scholarship");
        }
        sc.close();

    }
}
