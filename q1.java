import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any year:");
    int Year= sc.nextInt();
    if(Year%400==0 || (Year%4==0 && Year%100 !=0 )){
        System.out.println("It is a leap year");
    }else{
        System.out.println("It is not a leap year");
    }
    sc.close();


    }
    
}
