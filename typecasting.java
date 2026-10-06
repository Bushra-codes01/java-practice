import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter your marks:");
    double marks= sc.nextDouble();
    System.out.println(marks);
    int c= (int)marks;
    System.out.println("Your marks are:" + c);
    sc.close();

    }
}
