import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of n:");
        int n = sc.nextInt();
        System.out.println("the value of k:");
        int k = sc.nextInt();
        for (int i = k; i <= n; i += k) {
            System.out.println(i);

        }
        sc.close();
    }
}
