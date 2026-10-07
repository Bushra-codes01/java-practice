import java.util.Scanner;

public class divisiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        if (x % 5 == 2 && x % 3 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            sc.close();
        }
    }
}
