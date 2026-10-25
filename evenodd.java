import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int evencount = 0;
        int oddcount = 0;
        while (num > 0) {
            int dig = num % 10;
            num /= 10;
            if (dig % 2 == 0) {
                evencount += 1;
            } else {
                oddcount += 1;
            }
        }
        sc.close();
        System.out.println("evencount=" + evencount);
        System.out.println("oddcount=" + oddcount);

    }
}
