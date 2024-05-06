package CH5;

import java.util.Scanner;

public class ch5_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("今天是星期日 請輸入天數 : ");
        int day = sc.nextInt();
        int nextDay = (day + 7) % 7;
        switch(nextDay){
            case 0:
                System.out.printf("%d 天後是星期日", day);
                break;
            case 1:
                System.out.printf("%d 天後是星期一", day);
                break;
            case 2:
                System.out.printf("%d 天後是星期二", day);
                break;
            case 3:
                System.out.printf("%d 天後是星期三", day);
                break;
            case 4:
                System.out.printf("%d 天後是星期四", day);
                break;
            case 5:
                System.out.printf("%d 天後是星期五", day);
                break;
            case 6:
                System.out.printf("%d 天後是星期六", day);
                break;
        }
        sc.close();
    }
}
