package CH7;

import java.util.Scanner;

public class ch7_05 {
    public static void main(String [] args){
        System.out.println("如果輸入負分數則輸入結束");
    
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;
        int [] arr = new int[50];
        boolean flag = true;

        while(flag){
            System.out.print("請輸入分數 : ");
            int num = sc.nextInt();
            if(num < 0){
                flag = false;
                break;
            }
            sum += num;
            arr[count] = num;
            count++;   
        }

        avg = (double) sum/count;
        
        int h_count = 0;
        int l_count = 0;
        
        for(int i = 0;i<count;i++){
            if(arr[i] > avg){
                h_count++;
            }else{
                l_count++;
            }
        }

        System.out.printf("分數筆數 = %d\n", count);
        System.out.printf("平均分數 = %.2f\n", avg);
        System.out.printf("高於平均分數的人數 = %d\n", h_count);
        System.out.printf("低於平均分數的人數 = %d\n", l_count);
    }   
}
