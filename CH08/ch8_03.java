package CH8;

class SmallMath{ // 定義SmallMath類別
    int add(int x, int y){ // 定義add方法
        int z = x + y;
        return z;
    }
    int sub(int x, int y){ // 定義sub方法
        return x - y;
    }
    int mul(int x, int y){ // 定義mul方法
        return x * y;
    }
    int div(int x, int y){ // 定義div方法
        return x / y;
    }
}

public class ch8_03 {
    public static void main(String [] args){
        SmallMath A = new SmallMath(); // 建立一個SmallMath物件
        System.out.println(A.add(10,20)); // 顯示結果
        System.out.println(A.sub(10,20)); // 顯示結果
        System.out.println(A.mul(10,20)); // 顯示結果
        System.out.println(A.div(10,20)); // 顯示結果
    }
}
