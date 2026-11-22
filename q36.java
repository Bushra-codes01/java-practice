public class q36 {
    public static void main(String[] args) {
        int x = 123456;
        int evencount = 0;
        int oddcount = 0;
        for (int i = x; i != 0; i /= 10) {

            int mod = i % 10;
            if (mod % 2 == 0) {
                evencount += 1;
            } else {
                oddcount += 1;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
