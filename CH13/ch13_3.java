package CH13;

import java.util.Scanner;

public class ch13_3 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String pattern = new String();
        String str = new String();
        String flag = new String();
        boolean result = true;

        System.out.print("請輸入正規表達式字串 : ");
        pattern = sc.next();

        while(result){
            System.out.print("請輸入測試字串 : ");
            str = sc.next();
            System.out.println("比對結果 " + str.matches(pattern));
            System.out.print("是否繼續(y/n)? ");
            flag = sc.next();
            if(flag.equals("y")){
                result = true;
            }else{
                result = false;
            }
        }

        sc.close();
    }
}
