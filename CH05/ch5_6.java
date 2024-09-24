package CH05;

import java.util.Scanner;

public class ch5_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入身高(公分) : ");
        int height = sc.nextInt();
        System.out.print("請輸入體重(公斤) : ");
        int weight = sc.nextInt();
        double BMI = weight / ((height/100.0) * (height/100.0));
        System.out.printf("BMI = %.2f", BMI);
        sc.close();
        if(BMI < 18.5){
            System.out.print(" 體重過輕");
        }else if(BMI >= 18.5 & BMI < 24){
            System.out.print(" 健康體位");
        }else{
            System.out.print(" 體位異常");
        }
    }
}
