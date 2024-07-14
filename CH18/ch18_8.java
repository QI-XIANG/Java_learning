package CH18;

import java.util.Scanner;

public class ch18_8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入整數資料 A : ");
        String A = sc.next();
        System.out.print("請輸入整數資料 B : ");
        String B = sc.next();
        if(Integer.parseInt(A) > Integer.parseInt(B)){
            System.out.println("A > B");
        }else if(Integer.parseInt(A) < Integer.parseInt(B)){
            System.out.println("A < B");
        }else{
            System.out.println("A = B");
        }
        
        sc.close();
    }
}
