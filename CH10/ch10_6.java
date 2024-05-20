package CH10;

import java.util.Scanner;

public class ch10_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double r = 6371;
       
        System.out.print("請輸入第一個座標的緯度 : ");
        double x1 = sc.nextDouble();
        System.out.print("請輸入第一個座標的經度 : ");
        double y1 = sc.nextDouble();
        System.out.print("請輸入第二個座標的緯度 : ");
        double x2 = sc.nextDouble();
        System.out.print("請輸入第二個座標的經度 : ");
        double y2 = sc.nextDouble();
       
        double d;
        d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)) + 
        Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
        Math.cos(Math.toRadians(y1-y2)));

        System.out.println("distance = " + d);

        sc.close();
    }
}
