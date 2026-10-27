public class largest3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 5;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            }
        }

    }
}
