package CH19;

import java.util.Scanner;
import CH19.myMath.CalAdd;
import CH19.myMath.subMath.CalSub;

public class ch19_3 {
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);

        CalAdd obj1 = new CalAdd();
        CalSub obj2 = new CalSub();

        System.out.print("請輸入第1個整數 x : ");
        int x = sc.nextInt();

        System.out.print("請輸入第2個整數 y : ");
        int y = sc.nextInt();

        System.out.println("x + y = " + obj1.add(x, y));

        System.out.println("x - y = " + obj2.sub(x, y));
        
        sc.close();
    }
}
