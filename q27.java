public class q27 {
 
    public static void main(String[] args) {
        int x= 78654876;
        int sum=0;
    for(int i=x; i!=0; i/=10 ){
       int modulo=i%10;
       sum+=modulo;
    }
    System.out.println(sum);
    }
}

    

