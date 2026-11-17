public class q25 {
    
    public static void main(String[] args) {
        int num = 100;
        int evencount = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                int x = num / i;
                if (i % 2 == 0) {
                    evencount++;
                }
                if (x % 2 == 0 && i != x) {
                    evencount++;
                }

            }

        }
        System.out.println(evencount);

    }
}


