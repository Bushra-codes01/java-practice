public class problem3 {
    public static void main(String[] args) {
        int a= 4;
        int b= 3;
        int c= 7;
        int d= 5;
        int largest=(a>b)?((a>c)?(a>d)?(a):(d):((c>d)?(c):(d))):((b>c)?((b>d)?(b):(d)):(c>d)?(c):(d));
        System.out.println("The largest no. is :"+largest);
    }
}
