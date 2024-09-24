package CH05;

import java.util.Scanner;

public class ch5_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入本週工作時數 : ");
        int time = sc.nextInt();
        double salary;
        if(time < 40){
            salary = time * 150 * 0.8;
        }else if(time == 40){
            salary = time * 150;
        }else if(time > 40 & time <= 50){
            salary = time * 150 * 1.2;
        }else{
            salary = time * 150 * 1.6;
        }
        System.out.printf("本週薪資 : %.1f", salary);
        sc.close();
    }
}
