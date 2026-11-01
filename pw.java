
public class pw {
    public static void main(String[] args) {
        String pw = "Bushraaa";
        if (pw.length() >= 8) {
            boolean hasdigit = false;
            for (int i = 0; i < pw.length(); i++) {
                if (pw.charAt(i) >= '0' && pw.charAt(i) <= '9') {
                    hasdigit = true;
                    break;
                }
            }

            if (hasdigit == true) {
                System.out.println("Strong password");
            } else {
                System.out.println("Password must contain a digit");
            }
        } else {
            System.out.println("Password is too short");

        }
    }
}
