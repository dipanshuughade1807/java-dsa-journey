package ifelse;

import java.util.Scanner;

public class absulatevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int num = sc.nextInt();
        if(num<0){
            num = num*-1;
            System.out.print("number is "+ num);
        }else{
            System.out.print("number is " + num);

        }
    }
    
}
