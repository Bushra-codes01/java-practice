public class month {
    public static void main(String[] args) {
        int year = 2026;
        int month = 60;
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println("30 Days");
                } else {
                    System.out.println("31 Days");

                }
            }
        } else {
            System.out.println("Invalid month");
        }
    }
}
