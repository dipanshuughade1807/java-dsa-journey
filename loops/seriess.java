package loops;

import java.util.Scanner;

public class seriess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();
        for(int i = a; i>0; i = i-n)
           System.out.println(i);
    }
}
