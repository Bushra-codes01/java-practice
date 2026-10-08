import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed ");
        double unit = sc.nextDouble();
        
        if (unit<=100) {
            System.out.println("Your bill is = " + (unit*5));
        } 
        else if(unit<=200){
            System.out.println("Your bill is = " + (unit*7));
        }else if(unit<=300){
            System.out.println("Your bill is = " + (unit*10));
        }else if(unit>300){
            System.out.println("Your bill is = " + (unit*12));
        
            sc.close();
        }
        }
}
    
