import java.util.Scanner;
public class triangle{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side");
        int side1= sc.nextInt();
        System.out.println("Enter the second side");
        int side2= sc.nextInt();
        System.out.println("Enter the third side");
        int side3= sc.nextInt();
        if ((side1+side2>side3)&&(side2+side3>side1)&& (side3+side1>side2)){
            System.out.println("you can make a triangle");
        }if (side1 ==side2 && side2==side3){
            System.out.println("equilateral triangle");
        
         }else if (side1==side2||side2==side3||side3==side1){
            System.out.println("Isosceles triangle");
         }else{
            System.out.println("Scalene triangle");
         }
         sc.close();
         
        
        }


    }
