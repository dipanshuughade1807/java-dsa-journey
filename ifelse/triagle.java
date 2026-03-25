package ifelse;

import java.util.Scanner;

public class triagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first edge ");
        int a = sc.nextInt();

        System.out.print("enter second edge ");
        int b = sc.nextInt();

        System.out.print("enter third edge ");
        int c = sc.nextInt();

        if(a+b<c && b+c<a && a+c<b){
            System.out.println("this is a triagle");
        }else{
            System.out.println("this is not a triagle");
        }
    }
}
