public class problem9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
