package CH12;

import java.util.Scanner;

public class ch12_8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("請輸入英文句子 : ");
        String str = sc.nextLine();
        System.out.println("大寫輸入結果 : " + str.toUpperCase());
        
        sc.close();
    }
}
