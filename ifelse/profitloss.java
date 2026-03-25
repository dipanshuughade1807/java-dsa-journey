package ifelse;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a cost ");
        double cost = sc.nextDouble();

        System.out.print("enter a price ");
        double price = sc.nextDouble();
        

        if(price > cost){
            System.out.print("profit of " +(price - cost));
        }else if(cost > price){
            System.out.print("loss of " +(cost - price));
        }else{
            System.out.println("no profit");
        }

}
}


