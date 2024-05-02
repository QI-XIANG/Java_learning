package CH4;
import java.util.Scanner;

public class ch4_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入小於10的整數 : ");
        int x = sc.nextInt();
        System.out.printf("平方是 %.2f\n", x, Math.pow(x, 2));
        System.out.printf("立方是 %.2f\n", x, Math.pow(x, 3));
        sc.close();
    }
}
