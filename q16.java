public class q16 {
    public static void main(String[] args) {
        int n = 546783;
        int count = 0;
        while (n > 0) {
            int mod = n % 10;
            
            if (mod %2==0) {
                count = count + 1;
                
            }
            n = n / 10;

        }
        System.out.println(count);

    }
}