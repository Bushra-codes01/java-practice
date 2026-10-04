import java.util.Scanner;

public class cost{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the cost of the item:");
        float cost= sc.nextFloat();
        System.out.print("Enter the quantity of the item: ");
        int quantity =  sc.nextInt();
        System.out.print("The total cost of the items is :" + cost*quantity); 
    }

}