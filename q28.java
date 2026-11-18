public class q28 {
    
    public static void main(String[] args) {
        int x=78654876;
        int sum=0;
        for(int i=x; i!=0; i/=100){
            int modulo=i%100;
            
            sum+=modulo;
        }
        System.out.println(sum);
    }
}


