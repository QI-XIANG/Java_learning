package CH6;

import java.util.Scanner;

public class ch6_04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入存款本金 : ");
        int value = sc.nextInt();
        System.out.print("請輸入存款年數 : ");
        int year = sc.nextInt();
        System.out.print("請輸入存款年利率(%) : ");
        double rate = sc.nextDouble();
        double sum = value;
        for(int i = 1; i <= year; i++){
            sum += sum *  rate;
            System.out.printf("第 %d 年本金和 : %.1f\n", i, sum);
        }
        sc.close();
    }
}
