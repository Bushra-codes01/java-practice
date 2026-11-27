import java.util.Scanner;

public class prob02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int registrationNumber = scanner.nextInt();
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();

        if (registrationNumber < lowerLimit) {
            System.out.println("BELOW_RANGE");
        } else if (registrationNumber > upperLimit) {
            System.out.println("ABOVE_RANGE");
        } else {
            System.out.println("ELIGIBLE");
        }
        
        scanner.close();
    }
}
