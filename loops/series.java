package loops;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {

        
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the starting value");
        int a = sc.nextInt();

        System.out.println("enter the increment value");
        int d = sc.nextInt();

        System.out.println("enter a nth term");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a = a + d;
        }


    }
}
