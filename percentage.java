import java.util.Scanner;
public class percentage{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your maths marks:");
        Float marks1= sc.nextFloat();
        System.out.print("Enter your physics marks:");
        Float marks2= sc.nextFloat();
        System.out.print("Enter your chemistry marks:");
        Float marks3= sc.nextFloat();
        System.out.print("Your percentage is:" + (marks1+marks2+marks3)/3 );
        sc.close();
    }
}