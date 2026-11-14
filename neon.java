public class neon {
    public static void main(String[] args) {
        int n=9;
        int square=n*n;
        int square_sum=0;
        while(square>0){
           int num=square%10;
             square_sum+=num;
            square=square/10;
            }
            System.out.println(square_sum);
        if(n==square_sum){
            System.out.println(n+" "+ "is a Neon No." );
        }else{
            System.out.println("Not a Neon No.");
        }
        
    }
}
