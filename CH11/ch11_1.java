package CH11;

import java.util.*;

public class ch11_1 {
    public static void main(String [] args){
        long startDate, endDate;
        final int pwd = 70;
        int num;
        Scanner sc = new Scanner(System.in);
        startDate = System.currentTimeMillis();
        for(;;){
            System.out.print("請猜0-99的數字: ");
            num = sc.nextInt();
            if(num == pwd){
                System.out.println("恭喜猜對了!");
                endDate = System.currentTimeMillis();
                sc.close();
                break;
            }
            else if(num > pwd){
                System.out.println("請猜小一點");
            }
            else{
                System.out.println("請猜大一點");
            }
        }
        System.out.printf("執行時間: %.2f秒", (endDate - startDate)/1000.0);
    }
}
