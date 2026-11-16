public class factors {

    public static void main(String[] args) {
        int num = 120;
        int evencount;
        if (num % 2 == 0) {
            evencount = 1;
        } else {
            evencount = 0;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                if (i % 2 == 0) {
                    evencount += 1;
                }

            }
        }
        System.out.println(evencount);
    }
}
