import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int num1= sc.nextInt();
        System.out.println(num1);
        System.out.println("Enter the Second no.:");
        int num2= sc.nextInt();
        System.out.println(num2);
        System.out.println("Enter the third no.:");
        int num3= sc.nextInt();
        System.out.println(num3);

        System.out.println( "Your average is :" + (num1+num2+num3)/3);
    
}
}
