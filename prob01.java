import java.util.Scanner;

public class prob01{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int netChange = scanner.nextInt();

        if (netChange > 0) {
            System.out.println("SURPLUS");
        } else if (netChange < 0) {
            System.out.println("SHORTFALL");
        } else {
            System.out.println("BALANCED");
        }

        scanner.close();
    }
}
