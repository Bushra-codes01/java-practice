import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int n = num % 10;

            if (n > 5) {
                count += 1;
            }
            num = num / 10;
        }
        System.out.println(count);

        sc.close();
    }
}
