import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your password");
        String password= sc.nextLine();
        if (password.equals("12345")){
            System.out.println("Log in successfull");
         } else {
            System.out.println("Wrong password");
         }
         sc.close();
        }
    }



    
    

