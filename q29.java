public class q29 {
    
    public static void main(String[] args) {
    int x=78654876;
    int sum=0;
    for(int i=x; i !=0; i/=10){
        int mod=i%10;
        boolean isPrime=true;
        for(int j=2; j<mod; j++){
            if(mod%j==0){
                isPrime=false;
                break;
            }
        }
            if(isPrime)
            sum+=mod;
        

    }
    System.out.println("The sum of all the prime number = "+ sum);
    

    }
}



