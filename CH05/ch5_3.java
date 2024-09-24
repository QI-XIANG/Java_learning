package CH05;

import java.util.Scanner;

public class ch5_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("請輸入點座標(數字間用空白隔開) : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int distance = x*x + y*y;
        if(distance > 400){
            System.out.print("座標在圓外");
        }else{
            System.out.print("座標在圓內");
        } 
        sc.close();
    }
}
