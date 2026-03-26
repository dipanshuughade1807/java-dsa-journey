package loops;

import java.util.Scanner;

public class ap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 5, d = 5;
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            a = a + d;
            
        }
    }

}
