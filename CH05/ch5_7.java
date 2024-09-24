package CH05;

import java.util.Scanner;

public class ch5_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入身高(公分) : ");
        int height = sc.nextInt();
        if(height >= 200){
            System.out.print("這是中鋒人選");
        }else if(height >= 192 & height <= 199){
            System.out.print("這是前鋒人選");
        }else{
            System.out.print("這是後衛人選");
        }
        sc.close();
    }
}
