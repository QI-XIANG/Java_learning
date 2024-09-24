package CH04;
import java.util.Scanner;

public class ch4_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入華氏溫度 : ");
        int x =  sc.nextInt();
        System.out.printf("攝氏溫度是 %.2f\n", (x - 32) * 5 / 9.0);
        sc.close();
    }
}
