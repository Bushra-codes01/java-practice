public class p22 {
    public static void main(String[] args) {
        int n = 4567;
        int product = 1;

        while (n > 0) {
            int num = n % 10;
            product = product * num;
            n = n / 10;
        }
        System.out.println("Product of all the digits=" + product);
    }
}
