package CH6;

import java.util.Scanner;

public class ch6_08 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入高度 : ");
        int height = sc.nextInt();
        System.out.print("請輸入寬度 : ");
        int width = sc.nextInt();
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
