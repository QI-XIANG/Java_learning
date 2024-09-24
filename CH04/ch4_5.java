package CH04;
import java.util.Scanner;

public class ch4_5 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入英里 : ");
        int x = sc.nextInt();
        double mile = 1.609;
        System.out.printf("公里是 %.2f\n", x * mile);
        sc.close();
    }
}
