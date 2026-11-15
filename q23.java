public class q23 {
    public static void main(String[] args) {
        int n = 145;
        int original = n;

        int fact_sum = 0;
        while (n > 0) {
            int num = n % 10;
            int fact = 1;
            for (int i = num; i >= 1; i--) {
                fact = fact * i;
            }
            fact_sum += fact;
            n = n / 10;
        }
        System.out.println(fact_sum);
        if (fact_sum == original) {
            System.out.println("It's a strong no.");
        } else {
            System.out.println("Not a strong no.");
        }
    }
}
