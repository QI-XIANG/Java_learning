package CH19;
import java.util.Scanner;
public class ch19_1 {
    public static void main(String args []){
        double r;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入圓半徑 : ");
        
        r = sc.nextDouble();

        System.out.printf("圓面積 = %.13f\n", Math.PI * r * r);
        
        sc.close();
    }
}
