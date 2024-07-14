package CH18;

import java.util.Scanner;

public class ch18_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入資料型態 : ");
        String type = sc.next();
        //檢查輸入的是不是資料型態的名稱
        type = type.toLowerCase();
        if(type.equals("int") || type.equals("short") || type.equals("long") || type.equals("byte")){
            switch(type){
                case "int":
                    //輸出二進制位數
                    System.out.println(type + "的二進制位數 : " + Integer.SIZE);
                    //最大值
                    System.out.println(type + "的最大值 : " + Integer.MAX_VALUE);
                    //最小值
                    System.out.println(type + "的最小值 : " + Integer.MIN_VALUE);
                    break;
                case "short":
                    //輸出二進制位數
                    System.out.println(type + "的二進制位數 : " + Short.SIZE);
                    //最大值
                    System.out.println(type + "的最大值 : " + Short.MAX_VALUE);
                    //最小值
                    System.out.println(type + "的最小值 : " + Short.MIN_VALUE);
                    break;
                case "long":
                    //輸出二進制位數
                    System.out.println(type + "的二進制位數 : " + Long.SIZE);
                    //最大值
                    System.out.println(type + "的最大值 : " + Long.MAX_VALUE);
                    //最小值
                    System.out.println(type + "的最小值 : " + Long.MIN_VALUE);
                    break;
                case "byte":
                    //輸出二進制位數
                    System.out.println(type + "的二進制位數 : " + Byte.SIZE);
                    //最大值
                    System.out.println(type + "的最大值 : " + Byte.MAX_VALUE);
                    //最小值
                    System.out.println(type + "的最小值 : " + Byte.MIN_VALUE);
                    break;
            }
        }else{
            System.err.println("輸入錯誤");
        }
        sc.close();
    }
}
