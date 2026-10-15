import java.util.Scanner;
public class seats {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System .in);
        System.out.println(" Are Seats available?");
        String seats= sc.next();
        if(seats.equalsIgnoreCase("yes")){
            System.out.println("Enter your age");
            int age= sc.nextInt();
            if(age>0){
                System.out.println("Does  the student have a valid student ID ");
                String ID= sc.next();
                if (ID.equalsIgnoreCase("yes")){
                    System.out.println("You will get a 10% student discount");
                    System.out.println("Enter your amount");
                    int amount = sc.nextInt();
                    System.out.println("Your total amount with discount will be:"+(amount-(0.1*amount)));
                }else{
                    System.out.println("You will not get a student discount");
                   
                }
            }else{
                System.out.println("Invalid Age");
            }
        }else{
            System.out.println("No seats are available");
        }
        sc.close();
    }
}