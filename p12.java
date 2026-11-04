public class p12 {

    public static void main(String[] args) {
        int n = 123432;
        int num = n;
        int reverse = 0;
        for (; n > 0; n = n / 10) {
            int digit = n % 10;
            reverse = (reverse * 10 + digit);

        }
        if (reverse == num) {
            System.out.println("palindrome");

        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
