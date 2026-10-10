import java.util.Scanner;
public class largestsmallest{
public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter first no.:");
    int num1=sc.nextInt();
     System.out.println("Enter second no.:");
    int num2=sc.nextInt();
     System.out.println("Enter third no.:");
    int num3=sc.nextInt();
    if ((num1>=num2) &&  (num1>=num3)){
    System.out.println("Largest=" + num1);
    
    }  else if ((num2>=num3) &&  (num2>=num1)){
    System.out.println(" num2 is the largest:" + num2);
    }   else{
        System.out.println("num3 is the largest");
    }



    if((num1<=num2) &&  (num1<=num3)){
    System.out.println("Smallest=" + num1);
    
    }else if ((num2<=num3) &&  (num2<=num1)){
    System.out.println("  Smallest:" + num2);
    }else{
        System.out.println("Smallest:" + num3);
        sc.close();
}
}
}


