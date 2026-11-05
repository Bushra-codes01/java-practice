public class p14 {
    public static void main(String[] args) {
        int x= 5678;
        int sum=0;
        while(x>0){
            int y=x%10;
            sum+=y;
        x=x/10;
        }
        
        System.out.println(sum);
    }
}
