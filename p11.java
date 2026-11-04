public class p11{
    public static void main(String[] args) {
        int n= 1234;
        int reverse=0;
        for(;n>0; n=n/10 ){
            int digit=n%10;
            reverse=(reverse*10+digit);
            
        }
        System.out.println("Reversed number="+reverse);
    }
}