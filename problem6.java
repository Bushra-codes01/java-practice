public class problem6 {
    public static void main(String[] args) {
        int num=-20;
        if(num>0){
            if(num%2==0){
                if(num%10==0){
                System.out.println("It is a positive even no. divisible by 10 ");
                }else{
                   System.out.println("It is a positive even no. not divible by 10");
                }
            }else{
                System.out.println("Odd no.");
            }
        }else{
            System.out.println("It is a negative no.");
        }
    }
}
