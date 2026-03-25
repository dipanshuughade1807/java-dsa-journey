package ifelse;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("enter a value of x ");
        int x = sc.nextInt();

        System.out.print("enter a value of y ");
        int y = sc.nextInt();

        if((x>=0 && y>0) || (x>0 && y>=0)){
            System.out.println("first quadrant");
        }else if((x>=0 && y<0) || (x>0 && y<=0)){
         System.out.println("second quadrant");
        }else if((x<=0 && y<0) || (x<0 && y<=0)){
         System.out.println("third quadrant");
        }else if((x<=0 && y>0) || (x<0 && y>=0)){
         System.out.println("fourth quadrant");
        }else{
         System.out.println("origin");
        }
    }
}
