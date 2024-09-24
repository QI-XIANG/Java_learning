package CH05;

import java.util.Scanner;

public class ch5_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("請輸入3個整數(數字間用空白隔開) : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int [] arr = {x, y, z};
        System.out.printf("大到小分別是 : ");
        arr = sort(arr);
        for(int num: arr){
            System.out.printf("%d ", num);
        }
        sc.close();
    }
    
    public static int[] sort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] >= arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr; 
    }
}
