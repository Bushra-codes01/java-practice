import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();// 1221
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;// 1
            reversed = reversed * 10 + digit;// 0*10+1
            num = num / 10;
        }
        if (reversed == original) {
            System.out.println("palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
        sc.close();
    }
}
