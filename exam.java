import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your attendence percentage");
        float attendence= sc.nextFloat();
        if(attendence>=75){
            System.out.println("you are eligible for exams");
        
        System.out.println("Enter your marks");
        float marks = sc.nextFloat();
              if(marks>=40){
            System.out.println("You are pass");
            }
              else{
            System.out.println("fail");
            }
         } else{
         System.out.println("Not eligible");
        }
        sc.close();
    }
}
