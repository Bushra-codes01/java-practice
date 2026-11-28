import java.util.Scanner;
public class prob03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("LEAP_YEAR");


        }else{
            System.out.println("COMMON_YEAR");
        }
        sc.close();
    }
      
}
