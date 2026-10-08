import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product ");
        double price = sc.nextDouble();
        double discount = (0.1) * price;
        if (price >= 1000) {
            System.out.println("price after discount of 10% = " + (price - discount));
        } else {
            System.out.println("price =" + price);
            sc.close();
        }
    }
}