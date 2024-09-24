package CH05;

import java.util.Scanner;

public class ch5_1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("請輸入整數 : ");
        int x = sc.nextInt();
        if(x == 0){
            System.out.printf("輸入是 : %d", x);
        }else if(x%2 == 0){
            System.out.println("輸入是偶數");
        }else{
            System.out.println("輸入是奇數");
        }
        sc.close();
    }
}