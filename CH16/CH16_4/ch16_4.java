package CH16.CH16_4;

abstract class MyMath{
    abstract int add(int n1, int n2);
    abstract int add(int n1, int n2, int n3);
    abstract int mul(int n1, int n2);
    abstract int mul(int n1, int n2, int n3);
    abstract int sub(int n1, int n2);
    abstract int div(int n1, int n2);
    void output(){
        System.out.println("我的計算器");
    }
}

class MyTest extends MyMath{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int mul(int n1, int n2, int n3){
        return n1 * n2 * n3;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

public class ch16_4 {
    public static void main(String [] args){
        MyMath obj = new MyTest();
        obj.output();
        System.out.println("加法結果: " + obj.add(8, 3));
        System.out.println("加法結果: " + obj.add(8, 3, 10));
        System.out.println("乘法結果: " + obj.mul(8, 3));
        System.out.println("乘法結果: " + obj.mul(8, 3, 10));
    }
}
