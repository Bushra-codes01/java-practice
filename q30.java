public class q30 {
    public static void main(String[] args) {
        int x=34567;
        int count=0;
        for(int i=x; i !=0; i/=10){
           count++;
        }
        System.out.println("Total number of digits in a number=" + count);
    }
}
