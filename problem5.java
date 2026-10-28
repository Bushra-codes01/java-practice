public class problem5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;
        if (a == b) {
            if (a + b > c) {
                if (b + c > a) {
                    if (c + a > b) {
                        if (a == b) {
                            if (b == c) {
                                System.out.println("Equilateral triangle");
                            } else {
                                System.out.println("Isosceles triangle");
                            }
                        } else {
                            if (a == c) {
                                System.out.println("Isosceles Triangle");
                            } else {
                                if (b == c) {
                                    System.out.println("Isosceles Triangle");
                                } else {
                                    System.out.println("Scalene triangle");
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}
