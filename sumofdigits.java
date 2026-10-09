
public class sumofdigits {
    public static void main(String[] args) {

        int sum = 0;
        int num = 34567;
        int a = num % 10;
        sum = sum + a;
        num = num / 10;
        int b = num % 10;
        sum = sum + b;
        num = num / 10;
        int c = num % 10;
        sum = sum + c;
        num = num / 10;
        int d = num % 10;
        sum = sum + d;
        num = num / 10;
        int e = num % 10;
        sum = sum + e;
        System.out.println(sum);

    }
}
