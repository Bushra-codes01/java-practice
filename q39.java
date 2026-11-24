public class q39{
    
    public static void main(String[] args) {
        int x=654789;
        int reverse=0;
        for(int i=x; i!=0; i/=10){
         int mod=i%10;
         reverse=reverse*10+mod;
        }
        System.out.println(reverse);
            
    }
}


