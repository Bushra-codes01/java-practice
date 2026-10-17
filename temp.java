import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature:");
        float temp= sc.nextFloat();
        if(temp>35){
            System.out.println("Very Hot");
        }else if(temp>=20 && temp<=35){
            System.out.println("Warm");
        }else{
            System.out.println("Cold");
        }
        sc.close();
    }
}
