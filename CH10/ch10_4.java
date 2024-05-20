package CH10;

import java.util.Random;
import java.util.Scanner;

public class ch10_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int [] lottery = new int[50];
        System.out.print("請輸入購買威力彩數量 : ");
        int num = sc.nextInt();

        for(int i=1; i <= num; i++){
            System.out.printf("%d : \t", i);
            for(int n = 1; n <=49; n++){
                lottery[n] = n;
            }
            int counter = 1;
            while(counter <= 7){
                int lotteryNum;
                if(counter <= 6){
                    lotteryNum = rand.nextInt(49) + 1;
                }else{
                    lotteryNum = rand.nextInt(8) + 1;
                }
                if(lottery[lotteryNum] == 0){
                    continue;
                }else{
                    if(counter == 7){
                        System.out.printf("特別號 : ");
                    }
                    System.out.printf("%d \t", lotteryNum);
                    lottery[lotteryNum] = 0;
                    counter++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
