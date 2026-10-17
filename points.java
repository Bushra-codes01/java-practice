import java.util.Scanner;
public class points {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Has the player completed the level 1?");
        String level= sc.next();
        if(level.equalsIgnoreCase("yes")){

            System.out.println("Enter your level 1 score");
            int score= sc.nextInt();
            if(score>=500){
                System.out.println("level 2 unlocked");
            }else{
                System.out.println("level 2 is locked");
            }
        }else{
            System.out.println(" First complete the level 1 ");
        }
    }
    
}
