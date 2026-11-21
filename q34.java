public class q34 {
   
   
    public static void main(String[] args) {
        int x = 151;
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");

        } else {
            System.out.println("Composite number");
        }
    }
}
    
    