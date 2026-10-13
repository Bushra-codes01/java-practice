import java.util.Scanner;
public class recharge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want a data pack? (True/false)");
        boolean datapack= sc.nextBoolean();
        if(datapack==true){
            System.out.println("which package do you want?(1GB/day or 2GB/day");
        
            String dataplan = sc.next();
            if(dataplan.equalsIgnoreCase("1GB/day")){
            System.out.println("The cost of your recharge  is rs199. ");
            }else if 
                (dataplan.equalsIgnoreCase("2GB/day")){
            System.out.println("The cost of your recharge is rs299");
        
    
            }else{
            System.out.println("Invalid package");
            }
            }else{
                System.out.println("Do you want a calling only pack costing rs149");
            }
        sc.close();
        
    }
}


    

