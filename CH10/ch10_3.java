package CH10;

import java.util.Random;
import java.util.Scanner;

public class ch10_3 {
    public static void main(String args[]){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int lottery = rand.nextInt(10) + 1;
        boolean flag = true;
        int guess;
        while(flag){
            System.out.printf("請猜 1-10 間的數字 : ");
            guess = sc.nextInt();
            if(guess > lottery){
                System.out.println("請猜小一點");
            }else if(guess < lottery){
                System.out.println("請猜大一點");
            }else{
                System.out.println("恭喜答對了");
                flag = false;
            }
        }
        sc.close();
    }
}
