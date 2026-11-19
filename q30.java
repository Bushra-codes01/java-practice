public class q30 {
    public static void main(String[] args) {
        int x = 34567;
        int count = 0;
        int sum = 0;
        for (int i = x; i != 0; i /= 10) {
            int dig = i % 10;
            if (dig % 2 != 0) {
                count++;
                sum += dig;
            }

        }
        System.out.println("Total number of odd digits in the number=" + count);
        System.out.println("Sum of odd digits are=" + sum);
    }
}
