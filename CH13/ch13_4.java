package CH13;

import java.util.Scanner;
import java.util.regex.*;

public class ch13_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String pattern = new String();
        String str = new String();
        String flag = new String();
        boolean result = true;

        System.out.print("請輸入正規表達式字串 : ");
        pattern = sc.next();
        Pattern p = Pattern.compile(pattern);

        while(result){
            System.out.print("請輸入測試字串 : ");
            str = sc.next();
            Matcher m = p.matcher(str);
            System.out.println("比對結果 " + m.matches());
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
