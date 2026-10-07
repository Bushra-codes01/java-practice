import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int x= sc.nextInt();
         if (x%3==0){
            System.out.println("It is divisible by 3 ");
        } else {
            System.out.println("It is not divisible by 3 ");
         sc.close();
     }
    }
}  
