import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int product = 1;
        while (num > 0) {
            int dig = num % 10;
            num /= 10;
            product = dig * product;
        }
        sc.close();
        System.out.println("Product of the digits:" + product);
    }
}
