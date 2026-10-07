public class q2 {
    public static void main(String[] args) {
        int x = 75;
        int rem1 = x % 5;
        int rem2 = x % 3;
        int sum = rem1 + rem2;
        if (sum % 8 == 0 && sum != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
