public class sumeven {
    public static void main(String[] args) {
        int n=23456;
        int sum=0;
        while(n>0){
            int num=n%10;
            if(num%2==0){
                sum+=num;
              
            }
             n/=10;
        }
         System.out.println(sum);

    }
}
