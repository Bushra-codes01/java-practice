public class smallest {
    public static void main(String[] args) {
        int a = 4;
        int b = -5;
        int c = 7;
        int d = 10;
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    System.out.println("a is smallest");
                } else {
                    System.out.println("d is smallest");
                }
            } else {
                if (c < d) {
                    System.out.println("c is smallest");
                } else {
                    System.out.println("d is samllest");
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    System.out.println("b is smallest");
                } else {
                    System.out.println("d is samllest");
                }

            }
        }

    }
}
