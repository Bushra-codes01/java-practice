public class middle {
    public static void main(String[] args) {
        int a = 25;
        int b = 16;
        int c = 16;
        if (a <= b && a >= c || a >= b && a <= c) {
            System.out.println("a is in the middle");
        } else {
            if (b <= c && b >= a || b >= c && b <= a) {
                System.out.println("b is in the middle");
            } else {

                System.out.println("c is in the middle");

            }
        }
    }
}
