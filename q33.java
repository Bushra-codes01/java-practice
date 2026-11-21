public class q33 {
    
    
    public static void main(String[] args) {
        int x=45326712;
        int sum=0;
        for(int i=x; i!=0; i/=100){
            int modulo=i%100;
            
            sum+=modulo;
        }
        System.out.println(sum);
    }
}

