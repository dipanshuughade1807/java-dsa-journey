package loops;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            System.out.println(i);
            System.out.println(n);
            n = n-1; 
        }
    }
}
