public class q26 {
    
    public static void main(String[] args) {
        int x = 21;
        boolean isPrime=true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
               isPrime=false;
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

