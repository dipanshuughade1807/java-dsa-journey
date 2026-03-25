package ifelse;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter width ");
        int w = sc.nextInt();

        System.out.print("enter height ");
        int h = sc.nextInt();

        int area = w*h;
        int perimeter = 2*(w+h);

        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }else{
            System.out.println("area is not greater than perimeter");
        }

    }
}
