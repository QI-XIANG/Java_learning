package CH4;
import java.util.Scanner;

public class ch4_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入數列起始值 : ");
        int x = sc.nextInt();
        System.out.print("請輸入數列終點值 : ");
        int y = sc.nextInt();
        System.out.print("請輸入數列差異值 : ");
        int z = sc.nextInt();
        int sum = 0;
        for(int i = x; i <= y; i+=z){
            sum +=  i;
        }
        System.out.printf("%d 到 %d 差值是 %d 的數列總和是 %d\n",x ,y, z, sum);
        sc.close();
    }
}
