import java.util.Scanner;
public class delivery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Is the customer a premium member");
         String membership= sc.next();
         if(membership.equalsIgnoreCase("yes")){
            System.out.println("Free delivery");
         }
         System.out.println("Enter the cart amount");
        int cartamount = sc.nextInt();
         if(cartamount>=499){
            System.out.println("Free delivery");
        }else if(cartamount<499){
            System.out.println("Delivery fee :40rs");
        }else{
            System.out.println("Delivery fee :40 rs");
        }
        sc.close();
    }

}
