package ifelse;

import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int num = sc.nextInt();
        if (num>999 && num<10000) {
            System.out.println(num +" is a four digit number");
        }else{
             System.out.println(num +" is not a four digit number");
        }
    }
}
