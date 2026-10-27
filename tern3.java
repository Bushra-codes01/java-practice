public class tern3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 5;

        int largest = (a > b) ? ((a > c) ? (a) : (c)) : ((b > c) ? (b) : (c));
        System.out.println("largest no. is:" + largest);
    }
}