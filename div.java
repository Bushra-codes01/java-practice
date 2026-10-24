import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
