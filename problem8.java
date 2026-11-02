public class problem8 {

    public static void main(String[] args) {
        int evensum = 0;
        int oddsum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;

            }
        }
        System.out.println("The even sum is" + " " + evensum);
        System.out.println("The odd sum is" + " " + oddsum);

    }
}
