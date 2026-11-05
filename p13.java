public class p13 {
    public static void main(String[] args) {
        int num = 132333;
        int count = 0;
        while (num > 0) {
            int mod = num % 10;
            if (mod == 3) {
                count += 1;

            }
            num /= 10;

        }
        System.out.println("No. of times 3 appears:" + count);

    }

}