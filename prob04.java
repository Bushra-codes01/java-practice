import java.util.Scanner;

public class prob04{

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYear = scanner.nextInt();
        int endYear = scanner.nextInt();

        int count = 0;

        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
