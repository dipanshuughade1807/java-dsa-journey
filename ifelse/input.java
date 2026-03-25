package ifelse;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int num = sc.nextInt();
        if(num%5 == 0){
            System.out.println("riya");
        }else if(num%3 == 0) {
            System.out.println("ranu");
        }else if(num%5 == 0 && num%3 == 0){
            System.out.println("apurva");
        }else{
            System.out.println("isha");
        }
    }
}
