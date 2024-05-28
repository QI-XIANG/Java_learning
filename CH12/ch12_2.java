package CH12;

import java.util.Scanner;

public class ch12_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwxyz";
        
        System.out.print("請輸入字元: ");
        char ch = sc.next().charAt(0);
        if(str.indexOf(ch) != -1){
            System.out.println("索引位置 = " + str.indexOf(ch));
        }
        else{
            System.out.println("輸入錯誤");
        }

        sc.close();
    }
}
