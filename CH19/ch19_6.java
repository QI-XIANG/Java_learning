package CH19;

import java.util.Scanner;
import CH19.circle.*;

public class ch19_6 {
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
        
        calCircle obj = new calCircle();

        System.out.print("請輸入圓半徑 : ");
        int r = sc.nextInt();

        System.out.println("面積 : " + obj.area(r));

        System.out.println("圓周長 : " + obj.length(r));

        sc.close();
    }    
}
