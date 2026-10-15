import java.util.Scanner;
public class member {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        float amount = sc.nextFloat();
        if (amount >=5000){
            System.out.println("The customer is  a member?(true/false) ");

            boolean member= sc.nextBoolean();
            
             if(member==true) {
                System.out.println("You will get a 20% discount "); 
            }else{
              System.out.println("You will get a 10% discount");  
            }
        }else{
            System.out.println("You will not get a discount");
        }
        sc.close();
    }

}
