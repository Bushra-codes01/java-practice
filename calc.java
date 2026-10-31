public class calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        char operators = '*';
        switch (operators) {
            case '+':
                System.out.println("Addition of two no. is " + (a + b));

                break;
            case '-':
                System.out.println("Substraction of two no. is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of two no. is " + (a * b));
                break;
            case '/':
                System.out.println("Division of two no. is " + (a / b));
                break;
            case '%':
                System.out.println("Modulo of two no. is " + (a % b));
                break;

            default:
                break;
        }

    }

}
