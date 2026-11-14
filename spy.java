public class spy {
    public static void main(String[] args) {
        int n = 1124;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            product=product*num;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(product);
        if (sum == product) {
            System.out.println("It's a spy number");
        } else {
            System.out.println("It's not a spy number");
        }
    }
}
