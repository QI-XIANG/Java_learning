package CH11;

import java.util.*;
import java.time.*;

public class ch11_2 {
    public static void main(String [] args){
        LocalDateTime from, to;
        final int pwd = 70;
        int num;
        Scanner sc = new Scanner(System.in);
        from = LocalDateTime.now();
        for(;;){
            System.out.print("請猜0-99的數字: ");
            num = sc.nextInt();
            if(num == pwd){
                System.out.println("恭喜猜對了!");
                to = LocalDateTime.now();
                sc.close();
                break;
            }
            System.out.println("猜錯了請再答一次!");
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
