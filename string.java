
import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name= sc.nextLine();
        System.out.println("My name is :" + name);
        System.out.println("Enter your Address:");
        String address= sc.nextLine();
        System.out.println( "My Address is " + address);
        System.out.println("My name is " + name + " and "+ " My address is " + address);
        sc.close();
    
    }
}