public class p17 {
    public static void main(String[] args) {
        int num=1;
        int count=0;
        while(num<=100){
            if(num%7==0){
                count+=1;
            }
            num++;
        }
        System.out.println(count);
    }
}
