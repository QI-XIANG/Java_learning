package CH20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch20_4 {
    public static void main(String [] args) {
        int x1, x2;
        String flag;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.print("請輸入2個整數(數字間用空白隔開)：");
            try {
                x1 = sc1.nextInt();
                x2 = sc1.nextInt();
                System.out.println("數字除法結果是：" + (x1 / x2));
            } catch (ArithmeticException e) {
                System.out.println("除數為0的異常: " + e);
            } catch (InputMismatchException e) {
                System.out.println("輸入資料類型錯誤: " + e);
                sc1.next(); // 清除異常輸入的資料
            }
            System.out.print("是否繼續(y/n) : ");
            flag = sc2.next();
        } while (flag.equals("y"));  // 使用 equals 比較字串內容

        System.out.println("程式結束");
        sc1.close();  // 關閉 Scanner
        sc2.close();  // 關閉 Scanner
    }
}
