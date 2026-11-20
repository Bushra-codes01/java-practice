public class q32 {
    public static void main(String[] args) {
        int x = 1274534345;
        int count = 0;
        int sum = 0;
        for (int i = x; i != 0; i /= 10) {
            int dig = i % 10;
            if (dig % 2 == 0) {
                count++;
                sum += dig;
            }

        }
        System.out.println("Total number of even digits in the number=" + count);
        System.out.println("Sum of even digits are=" + sum);
    }
}
