package CH6;

import java.util.Scanner;

public class ch6_03 {
    public static void main(String [] args){
        final int pwd = 70;
        int num, sum = 0;
        String flag;
        Scanner sc = new Scanner(System.in);

        for( ; ; ){
            System.out.print("請輸入0-99的數字 : ");
            
            try{
                num = sc.nextInt();
                sum++;
                if(num == pwd){
                    System.out.println("恭喜猜對了!!");
                    System.out.println("總共猜了 " + sum + " 次");
                    sc.close();
                    break;
                }
                if(num > pwd){
                    System.out.println("請猜小一點!");
                }else{
                    System.out.println("請猜大一點!");
                }
                
            }catch(Exception e){
                if(sc.hasNext()){
                    flag = sc.next();
                    if(flag.equalsIgnoreCase("q")){
                        System.out.println("謝謝使用!");
                        sc.close();
                        break;
                    }
                
                }
            }
        }

    }
}
