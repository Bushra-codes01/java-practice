import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Radius of the circle: ");
    double radius = sc.nextInt();
    System.out.println("Area of circle is:"+ 3.14* radius* radius );
    sc.close();
    }
}