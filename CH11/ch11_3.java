package CH11;

import java.util.*;
import java.time.*;

public class ch11_3 {
    public static void main(String [] args){
        Instant from, to;
        final int pwd = 26;
        int num;
        Scanner sc = new Scanner(System.in);
        from = Instant.now();
        for(;;){
            System.out.print("請猜0-99的數字: ");
            num = sc.nextInt();
            if(num == pwd){
                System.out.println("恭喜猜對了!");
                to = Instant.now();
                sc.close();
                break;
            }
            if(num > pwd){
                System.out.println("請猜小一點");
            }
            else{
                System.out.println("請猜大一點");
            }
        }
        Duration duration = Duration.between(from, to);
        if(duration.toDays() != 0){
            System.out.println("所花時間總天數: " + duration.toDays());
        }
        if(duration.toHours() != 0){
            System.out.println("所花時間總小時數: " + duration.toHours());
        }
        if(duration.toMinutes() != 0){
            System.out.println("所花時間總分鐘數: " + duration.toMinutes());
        }
        //System.out.println("所花時間總秒數: " + duration.toSeconds());
        System.out.println("所花時間總毫秒數: " + duration.toMillis());
        System.out.println("所花時間總奈秒數: " + duration.toNanos());
    }
}
