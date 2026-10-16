import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Is the electricity bill  paid?");
        String bill= sc.next();
        if(bill.equalsIgnoreCase("yes")){
            System.out.println("Your bill is paid");
            System.out.println("Is the  connection (Avtive/Deactive)?");
            String connection= sc.next();
            if(connection.equalsIgnoreCase("Active")){
                System.out.println("Electricity Available");
            }else{
                System.out.println("Electricity is not Available");
            }
            sc.close();
        }else{
            System.out.println("Please pay your Bill");
        }
    }
}
