import java.util.Scanner;

public class sumeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even no. upto " + n + " is " + sum);
        sc.close();
    }

}
