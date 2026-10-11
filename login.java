import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.next();
        System.out.println("Enter your password:");
        String password = sc.next();
        if (username.equals("bushra")) {
            if (password.equals("bus123456")) {
                System.out.println("Login successful");
            } else {
                System.out.println("Incorrect password");
            }
        }else{
            System.out.println("Invalid username");
        }
        sc.close();
    }
}
