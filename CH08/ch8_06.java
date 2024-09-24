package CH08;

import java.util.Scanner;

public class ch8_06 {   
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入分數 : ");
        System.out.print(grade(sc.nextInt()));
        sc.close();
    }
    public static String grade(int grade){
        if(grade >= 90){
            return "A";
        }else if(grade >= 80){
            return "B";
        }else if(grade >= 70){
            return "C";
        }else if(grade >= 60){
            return "D";
        }else{
            return "E";
        }
    }
}
