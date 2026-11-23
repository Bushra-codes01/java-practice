public class q37 {
   
    public static void main(String[] args) {
        int x = 453216857;
        int evensum = 0;
        int oddsum = 0;
        for (int i = x; i != 0; i /= 10) {
            int mod = i % 10;
            if (mod % 2 == 0) {
                evensum += mod;
            } else {
                oddsum += mod;

            }
        }
        int difference = Math.abs(oddsum - evensum);
        System.out.println(difference);
        if (difference <=1) {
            System.out.println("Neither a prime nor a composite");
        }else{
        boolean isPrime = true;
        for (int j = 2; j <= difference / 2; j++) {
                if (difference % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        
        if (isPrime) {
            System.out.println("The difference is prime no.");
        } else {
            System.out.println("the difference is not prime");
        }

    }
}
}