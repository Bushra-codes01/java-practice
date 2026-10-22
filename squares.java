import java.util.Scanner;

public class squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        sc.close();
    }
}
