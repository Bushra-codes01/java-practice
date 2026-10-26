public class problem2 {
    public static void main(String[] args) {
        int a=-100;
        int b=12;
        int c=13;
        int d=1;
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("a is largest");
                }else{
                    System.out.println("d is largest");
                }
            

            }else{//c>a,b
               if(c>d){
                System.out.println("c is largest");
               }else{
                System.out.println("d is largest");
               }
            }

        }else{//b>a 
          if(b>c){
            if(b>d){
                System.out.println("b is largest");
            }else{
                System.out.println("d is largest");
            }
          }else{
            if(c>d){
                System.out.println("c is largest");
            }else{
                System.out.println("d is largest");
            }
          }
        }

    }
}
